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
