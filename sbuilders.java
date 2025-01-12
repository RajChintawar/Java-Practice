public class sbuilders {
    public static void main(String[] args) {
        StringBuilder rac = new StringBuilder("Soham");
//         System.out.println(rac);

// //SET CHAR AT INDEX 0 
//         rac.setCharAt(0, 'P');
//         System.out.println(rac);

// ///INSERT CHAR AT INDEX
// rac.insert(0, 'S');
// System.out.println(rac);


// /// DELETE CHAR AT INDEX
// rac.deleteCharAt(1);
// System.out.println(rac);




// //ADD CHAR AT LAST
// rac.append("e");
// System.out.println(rac);



//Reverse character in string

for (int i = 0; i <rac.length()/2; i++) {
    int front = i;
    int back = rac.length()-i-1;

char frontchar =rac.charAt(front);
char backchar = rac.charAt(back);

rac.setCharAt(front, backchar);
rac.setCharAt(back, frontchar);


    
}
System.out.println(rac);

    }
}
