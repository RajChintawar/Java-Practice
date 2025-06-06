class calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
class Advcalc extends calc {
    public int multiply(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
    

    
}

public class inherit {
    public static void main(String[] args) {
        Advcalc dom = new Advcalc();
        int r1 = dom.add(7, 11);
         int r2= dom.div(8, 4);
         System.out.println("Addition is "+r1+" "+ "Div is "+r2);
    }
}
