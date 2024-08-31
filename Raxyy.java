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

     /*    String fruit = in.next();
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

/// Switch case neat exxample with int
 int day = in.nextInt();

switch(day){
    case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
    case 6, 7 -> System.out.println("Weekend");
}
    }
}
*/


//////Perform SWAP CODE
/*
         int a = 10;
      int b = 20;
      int temp = a;
      a = b;
      b= temp;
      System.out.printf(a+ " " +b);
*/



  /////VAR ARGUMENTS EXAMPLE      

/*fun(2,3,45,88,75,77,656,875,85,78,8);
    }
    static void fun(int...v){
      System.out.println(Arrays.toString(v));   ////Arrays.toString helps to print everything in a array.
        
    }

}
*/



///// ARRAYS and its SYNTAX
        
String[] str = new String[5];
  for(int i= 0; i< str.length; i++){
    str[i]= in.next();
  }
  str[0]= "Yassh";
  str[1]= "Aditya";
  System.out.print(Arrays.toString(str));
}
}




        
//// Input in an 2D array :
int [][] arr = new int[3][3];
 
for (int row=0; row< arr.length; row++){
  //for row

for (int col=0; col<arr[row].length; col++){

arr[row][col] = in.nextInt();
System.out.print(arr[row][col] + " ");
  }
  System.out.println();
}
  }
}




////WAY 2nd to PRINT an multidimensional array but without taking input in terminal no scanner in required.

int [][] raj = {
  {1, 2, 3},
  {4, 5},
  {6, 7, 8}
};
for (int row=0; row< raj.length; row++){
for (int col=0; col< raj[row].length; col++){
  System.out.print(raj[row][col]+ " ");
}
System.out.println();
}
  }
}

        
