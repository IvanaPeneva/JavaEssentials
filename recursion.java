import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n<0){
            throw new RuntimeException("Unterflow");
        }
        else if (n>20){
            throw new RuntimeException("Overflow");
        }
        else if (n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
