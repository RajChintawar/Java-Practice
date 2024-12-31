

class Home{
    public static void main(String[] args) {
Scanner in = new Scanner(System.in)

//        INVERSE PYRAMID
//        int n =4;
//        for( int i=n; i>=1; i--){
//         for( int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//     }
// }



// ROTATED HALF PYRAMID
// int n = 4;
// for(int i =1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }

// for(int j=1; j<=i; j++){
//     System.out.print("*");
// }
// System.out.println();
//     }=
//     }
// }


/// Pyramid 1234
// int n = 5;
// for (int i=1; i<=n; i++){
//     for( int j=1; j<=i; j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }
//     }
// }


// PYRAMID OF NOS. 


// int n = 5;
// int number=1;
// for (int i=1; i<=n; i++){
//     for( int j=1; j<=i; j++){
//         System.out.print(number +" ");
//         number++;
//     }
//     System.out.println();
// }
//     }
// }

//OUTPUT
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15



int n =5;
for( int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
        int sum= i+j;
        if(sum%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
    System.out.println();
}
    }
}

////HOLLLOW RECTANGLE OR SQAURE PATTERN

int n = in.nextInt();
 int m = in.nextInt();
 for(int i=1; i<=n; i++){
  for(int j=1; j<=m; j++){
    if(i==1 || j==1 || i==n || j==m){
    System.out.print("*");
  }else{
    System.out.print(" ");
  }
  
 } 
 System.out.println();
}
}
}
