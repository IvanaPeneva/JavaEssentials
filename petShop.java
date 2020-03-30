import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dogs= Integer.parseInt(scanner.nextLine());
        int animals=Integer.parseInt(scanner.nextLine());

        double totalSum= dogs*2.5+ animals*4;
        System.out.printf("%.2f lv.", totalSum);


    }
}
