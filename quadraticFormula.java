import java.util.Scanner;

public class quadraticFormula {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();


        double discriminant=b*b-4*a*c;
        if (discriminant<0) {
            System.out.println("No real roots");
        }else {
            double firstResult = (-b + Math.sqrt(discriminant)) / (a * 2);
            double secondResult = (-b - Math.sqrt(discriminant)) / (a * 2);
            System.out.println(firstResult);
            System.out.println(secondResult);
        }
    }
}
