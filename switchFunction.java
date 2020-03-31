import java.util.Scanner;

public class switchFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String figureType = scanner.nextLine();
        double area=0.00;
        switch (figureType) {
            case "s":
                double a =Double.parseDouble(scanner.nextLine());
                area=a*a;
                break;
            case "r":
                double c = Double.parseDouble(scanner.nextLine());
                double d =Double.parseDouble(scanner.nextLine());
                area= c*d;
                break;
            case "c":
                double e = Double.parseDouble(scanner.nextLine());
                area=e*2*3.14;
                break;
        }
        System.out.printf("%.3f",area);
    }
}
