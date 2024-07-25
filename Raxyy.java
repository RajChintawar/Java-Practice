import java.util.Scanner;

public class Raxyy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*int n = in.nextInt();
int a = 0;
int b = 1;
int count = 2;
while ( count <= n) {
    int temp = b;
    b = b + a;
    a = temp;
    count++;
}
System.out.println(b);
}
}*/


/// SWITCH CASE IN JAVA

         String fruit = in.next();
        switch (fruit) {
            case "Mango" :
            System.out.println("King");
            break;
            case "Apple":
            System.out.println("Keeps doctor away");
            break;
            case "Orange":
            System.out.println("Nagpur King");
            break;
            default:
            System.out.println("Please enter valid fruit");
        }
    }
}



