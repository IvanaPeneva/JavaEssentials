import java.util.Scanner;

public class inchesToCm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cm= Double.parseDouble(scanner.nextLine());
        double toInch=cm*2.54;
        System.out.println(toInch);
    }
}
