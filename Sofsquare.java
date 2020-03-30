import java.util.Scanner;

public class Sofsquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text =scanner.nextLine();
        int number= Integer.parseInt(text);

        int area= number*number;
        System.out.println(area);

        Scanner sc1=new Scanner(System.in);
        String text1 =sc1.nextLine();
        int number1= Integer.parseInt(text1);

        int a =number*number1;
        System.out.println(a);

    }
}
