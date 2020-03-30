import java.util.Scanner;

public class basicsWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=Double.parseDouble(scanner.nextLine());
        double b=Double.parseDouble(scanner.nextLine());
        double result1= a+b;
        double result2=a-b;
        double result3=a*b;
        double result4=a/b;
        System.out.println(result4);
    }
}
