import java.util.Scanner;

public class graterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if(a>b) {
            System.out.println(a+" is a greater numrer");};
        if (a<b) {
            System.out.println(b+" is a greater number");

        }
        System.out.println("DONE");
    }
}
