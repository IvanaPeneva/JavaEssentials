import java.util.Scanner;

public class GreatingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text =scanner.nextLine();
        System.out.println("Hello " + text + "!");
        //or
        System.out.print("Hello ");
        System.out.print(text);
        System.out.println("!");

    }
}
