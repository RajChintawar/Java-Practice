import java.util.Scanner;

public class Raxyy {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
int n = in.nextInt();
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
}


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

/// Switch case neat exxample with int
 int day = in.nextInt();

switch(day){
    case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
    case 6, 7 -> System.out.println("Weekend");
}
    }
}



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


///// ARRAY LIST EXAMPLE AND VARIUOS FUNCTION IN IT  !!!!

ArrayList<String> list = new ArrayList<>(6);
list.add("Raj");
list.add("Yash");
list.add("Soh");
list.add("Anish");
list.add("Ravi");
list.add("Adi");
list.add("Soham");
list.add("Shubh");

System.out.println(list);
System.out.println(list.contains("Sam"));
list.set(2, "Payal");
System.out.println(list);
list.remove(2);
System.out.println(list);
  }
}



int [] nums = {1, 2, 3, 4, 7 ,9,11};
int target = 11;
int ans = Lsearch(nums, target);
System.out.println(ans);
        }
    

static int Lsearch( int[] arr, int target){
    if (arr.length== 0){
        return -1;
    }
    for (int index =0 ; index<arr.length ; index++){
        int element = arr[index]; 
        if (element ==target){
            return index;
        }
        
    }
    return -1;

        
    }
}


String name = "Soham";
char target ='S';
System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}


/////// SEARCHING ELEMENT IN ARRRAY IN A PARTICULAR RANGE OF INDEX.

int [] nums = {1, 2, 3, 4, 7 ,9,11};
int target = 4;
int ans = Lsearch(nums, target);
System.out.println(ans);
        }
    

static int Lsearch( int[] arr, int target){
    if (arr.length== 0){
        return -1;
    }
    for (int index =1 ; index<=5 ; index++){
        int element = arr[index]; 
        if (element ==target){
            return index;
        }
        
    }
    return -1;

        
    }
}


/////LINEAR SEARCH OF MINIMUM ELEMENT IN ARRAY.

 int[] arr = {59, 82, 41, 21, -5, 22};
 System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans= arr[0];
        for (int i =1;  i < arr.length ; i++){
            if (arr[i]< ans){
                ans=arr[i];
            }
            
        }
            return ans;
        }
}
