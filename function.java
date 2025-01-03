
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

