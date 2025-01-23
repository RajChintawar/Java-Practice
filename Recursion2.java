public class Recursion2 {

    //Reverse string using Recursion
    public static void reversestr(String str, int idx ){
if (idx ==0) {
    System.out.println(str.charAt(idx));
    return;    
}
System.out.print(str.charAt(idx));
reversestr(str, idx-1);    
}
public static void main(String[] args) {
    String str = "Navjeevan";
    reversestr(str, str.length()-1);
}

}


//Count first and last occurance of element.

public static int first = -1;
public static int last = -1 ;

public static void elementfd(String str, int idx, char element){
if(idx == str.length()
){
    System.out.println(first);
    System.out.println(last);
    return;
}  
    
    
    
    char currChar = str.charAt(idx);
        if (currChar==element) {
            if (first==-1) {
                first =idx;
            }
            else{
                last =idx;
            }

        }
        elementfd(str, idx+1, element);
}

public static void main(String[] args) {
    String str = "MangoMafiaaMunch";
    elementfd(str, 0, 'M');
}
}



//Tells if array is sorted or not.

public static boolean dhakan(int arr[], int idx ){
    if(idx ==arr.length-1){
        return true;
    } 
    if (arr[idx]<arr[idx+1]){
        return dhakan(arr, idx+1);
    }
    else{
        return false;
    } 
}
public static void main(String[] args) {
    int arr[] = {1,2,3};
    System.out.println(dhakan(arr, 0));
}
}
