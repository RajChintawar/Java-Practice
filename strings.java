import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String fullname = sc.nextLine();
System.out.println("Your name is :"+fullname);
    }
}




//Concatenation
String name = "Soham";
String sur = "Oberoi";
String fullname = name +" "+sur;
System.out.println(fullname);
System.out.println(fullname.length()); //Pre Existing to give length


//charAt
for (int i = 0; i < fullname.length(); i++) {
    System.out.println(fullname.charAt(i));     ///Print each character pre existing. 
}




}
}

 