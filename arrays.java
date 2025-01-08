
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
       //LINEAR SEARCH ARRAY 
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt(); 
        
        int[] numbers = new int[size];
        
        
        //input
        for (int i = 0; i <size; i++) {
        numbers[i] = sc.nextInt();
            
        }
        
        int x = sc.nextInt();
        for (int i = 0; i <numbers.length; i++){
            if(numbers[i]==x){
System.out.println("Element found at index :"+i );

            }
        }
            
        }
    
    }

//Take an array of names as input from the user and print them on the screen.

        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt(); 
        
        String[] names = new String[size];
        
        
        //input
        for (int i = 0; i <size; i++) {
        names[i] = sc.next();
            
        }
        
        for (int i = 0; i <size; i++) {
System.out.print(Arrays.toString(names));
        }
    }
}




 //Find the maximum & minimum number in an array of integers. 

        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt(); 
        
        int[] numbers = new int[size];
        
        
        //input
        for (int i = 0; i <size; i++) {
        numbers[i] = sc.nextInt();
            
        }


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i <numbers.length; i++) {
if(numbers[i]<min){
    min = numbers[i];
}
if(numbers[i]>max){
    max = numbers[i];
}


        }
System.out.println("Largest number is : "+max);
System.out.println("Smallest number is : "+min);




    }
}





