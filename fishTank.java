import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l=Integer.parseInt(scanner.nextLine());
        int s=Integer.parseInt(scanner.nextLine());
        int h=Integer.parseInt(scanner.nextLine());
        double pro=Double.parseDouble(scanner.nextLine());
        int V=l*s*h;
        double liters=V*0.001;
        double dis=pro*0.01;
        double total= liters*(1-dis);
        System.out.printf("%.3f", total);
    }
}
