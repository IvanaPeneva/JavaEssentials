import java.util.Scanner;

public class MethodsBasics {

    static void printBorder(int length, String symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();//(:
    }

    static void printBorder(int length) { //could be different name that the lst but its better this way
        printBorder(length, "*");
    }

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int borderLength = scanner.nextInt(); //!!!!
        printBorder(borderLength);
        printHello();
        printBorder(borderLength, "-");
    }
}
