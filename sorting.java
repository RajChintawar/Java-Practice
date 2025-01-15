

public class sorting {

    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length; i++) {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //bubble Sort
    public static void main(String[] args) {
        int arr[] = {7,3,2,8,9};
        for (int i = 0; i <arr.length-1; i++) {
          for (int j = 0; j < arr.length-i-1; j++) {
              if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
              }
          }  
        }
        printArray(arr);
    }
}

//Selection Sort

public static void selectionArray(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[] ={88,52,50,32,11,29};
    for (int i = 0; i <arr.length-1; i++) {
        int smallest = i;
for (int j = i+1; j < arr.length; j++){
       if(arr[smallest]>arr[j]){
        smallest = j;
       }
}      
int temp = arr[smallest];
arr[smallest]=arr[i];
arr[i]=temp;





    }
    selectionArray(arr);
}
}
