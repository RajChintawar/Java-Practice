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

//Comparision in strings !!!
String name1 = "Om";
String name2 = "Raj";
if(name1.compareTo(name2)==0) {     //.compareTo() function to compare Strings
    System.out.println("Both Strings are equal");
 }else{
    System.out.println("Strings are unequal");
}


//.substring function in which starting index is given and ending while the characters between are given as output.
String name = "Drunk Forever";
String nane = name.substring(6, name.length());
 System.out.println(nane); 
}










}


 
