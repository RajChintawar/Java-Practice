public class problems{
  // Enter 3 numbers from the user & make a function to print their average.

    public static int avgfunction(int a, int b, int c){
int avg = (a+b+c)/3;
return avg;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg  = avgfunction(a, b, c);
        System.out.println("Avg of three nos.: " +avg);

    }
}
