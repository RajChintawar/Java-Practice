
import java.util.Scanner;

public class function {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);
//     }
//  }




//// FUNCTION FOR ADDITION OF TWO NOS.

// public static int calculateSum( int a, int b){
//     int sum = a + b;
//     return sum;
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
// int sum = calculateSum(a, b);
// System.out.println("Sum of 2 nos. :" +sum);
// }
// }



// FUNC FOR PRODUCT OF TWO NOS.

// public static int calculateProduct(int a , int  b){
//     int product = a*b;
//     return product;
// }
// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int a = in.nextInt();
//     int b = in.nextInt();
//     int product = calculateProduct(a, b);
//     System.out.println("Product of two nos. :" +product);

// }
// }


/// FACTORIAAL OF NO.
public static int calculateFactorial(int n ){
    int factorial = 1;
    for(int i=n; i>=1; i--){
        factorial= factorial *i;
    }
    System.out.println(factorial);
    return 0;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    calculateFactorial(n);

}
}










//Using class and static variable

class Demo{
    String brand;
    int price;
   static String name;   ///static variable created.

    public void show(){
        System.out.println(brand +":"+ price +":"+ name);
    }
}
public class Mobile{
    public static void main(String[] args) {
        Demo rom = new Demo();
rom.brand ="Apple";
rom.price = 15000;
Demo.name = "Smartphone";  //can be called by class name and no object creation is nessecary.

Demo roa = new Demo();
roa.brand ="Samsung";
roa.price = 1500;
Demo.name = "Smartphone";

rom.show();
roa.show();
    }
}


