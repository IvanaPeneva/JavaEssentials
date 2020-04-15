import java.util.Scanner;

public class mathPower {
    static double mathPower(double a, double b) {

        /*double result= Math.pow(a,b);
        return result;*/
        double c=1;
        for (int i=0; i<b;i++){
             c*=a;

        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=Double.parseDouble(scanner.nextLine());
        double b=Double.parseDouble(scanner.nextLine());

        System.out.println(mathPower(a,b));
    }
}
