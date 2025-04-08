class Demo{
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand +":"+ price +":"+ name);
    }
}
public class Mobile{
    public static void main(String[] args) {
        Demo rom = new Demo();
rom.brand ="Apple";
rom.price = 15000;
rom.name = "Smartphone";

Demo roa = new Demo();
roa.brand ="Samsung";
roa.price = 1500;
roa.name = "Smartphone";

rom.show();
roa.show();
    }
}
