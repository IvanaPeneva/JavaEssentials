import java.util.Scanner;

public class SOfFigurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        double area = 0.0;
        if (a.equals("square")) {
            double n = Double.parseDouble(scanner.nextLine());
            area = n * n;
        } else if (a.equals( "rectangle")) {
            double n = Double.parseDouble(scanner.nextLine());
            double m = Double.parseDouble(scanner.nextLine());
            area = n * m;
        } else if (a.equals("circle")) {
            double n = Double.parseDouble(scanner.nextLine());
            area = 2 * n * 3.14;
        } else if (a.equals("triangle")) {
            double n = Double.parseDouble(scanner.nextLine());
            double m = Double.parseDouble(scanner.nextLine());
            area = n * m / 2;
        }

            System.out.printf("%.2f",area);
        }
    }
