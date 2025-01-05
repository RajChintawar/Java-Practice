public class problems{
  // Enter 3 numbers from the user & make a function to print their average.

    public static int avgfunction(int a, int b, int c){
int avg = (a+b+c)/3;
return avg;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg  = avgfunction(a, b, c);
        System.out.println("Avg of three nos.: " +avg);

    }
}


// Write a function to print the sum of all odd numbers from 1 to n.

public static int oddSum(int n){
    int sum = 0;
    for (int i=1; i<=n; i++){
        if( i%2 != 0){
          sum = sum+i;
        }
    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
   int reasult = oddSum(n);
System.out.println(reasult);

}
}


// Write a function which takes in 2 numbers and returns the greater of those two.


public static int greater(int a, int b){
    if(a>b){
        return a;
    }else {
        return b;
    }

}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int reasult = greater(a, b);
    System.out.println("Greater of two: "+reasult);

}
}




//Write a function that takes in the radius as input and returns the circumference of a circle.

public static double circumference(double a){
    return 2*3.14*a;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double ans = circumference(a);
System.out.println(" Circumference of circle : " +ans);

}
}

