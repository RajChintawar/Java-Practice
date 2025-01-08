import java.util.*;
public class twodarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Printing 2 D Array
   int rows = in.nextInt();
   int columns = in.nextInt();
   int[][] number = new int[rows][columns];

   for (int i=0; i<rows; i++){
    for(int j=0; j<columns; j++){
        number[i][j] = in.nextInt();
    }
   }

   for (int i =0; i<rows; i++){
    for(int j=0; j<columns; j++){
        System.out.print(number[i][j] + " ");
    }
    System.out.println();

    }

   }
   
    }




//Searching in 2D Array

int rows= in.nextInt();
int cols = in.nextInt();
int[][] number = new int[rows][cols];

for (int i = 0; i <rows; i++){
    for (int j =0; j<cols; j++){
        number[i][j] = in.nextInt();
    }
}

int x = in.nextInt();
for (int i = 0; i <rows; i++){
    for (int j =0; j<cols; j++){
if(number[i][j]==x){
    System.out.println("x got location ("+i+","+j+")");
}
    }
}




for (int i = 0; i <rows; i++){
    for (int j =0; j<cols; j++){
        System.out.print(number[i][j]+" ");
    }
    System.out.println();

}
}
}
