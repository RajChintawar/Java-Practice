public class recursion1 {
    public static void printnumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumb(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        printnumb(n);
    }
}



///Recusrsion add n natural numbers
public static void printnumb(int i,int n , int sum){
        if(i==n){
            sum+=i; 
            System.out.println(sum);
            return;
        }
        sum+=i;
        printnumb(i+1, n, sum);
    }
    public static void main(String[] args) {
        printnumb(1, 5, 0);
        
    }
}
