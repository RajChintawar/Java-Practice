class A {
void show(){
System.out.println("Class A");
}}
class B extends A{
System.out.println("Class B");
}

class Inheritance {
public static void main(String args[]){
B doma = new B();
doma.show();
}
}