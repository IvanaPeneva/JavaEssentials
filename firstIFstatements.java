import java.util.Scanner;

public class firstIFstatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a= Double.parseDouble(scanner.nextLine());
        if (a>=5.5) {
            System.out.println("Exellent");}
        else {
                System.out.println("Bad");
            }
    }
}
