import java.util.Scanner;

public class Main {

    static void printBorder(int length, String symbol){
        for(int i=0; i<length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int borderlength=scanner.nextInt(); //!!!!
        String borderSymbol =scanner.next();
        printBorder(borderlength,borderSymbol);
        ///printBorder(borderlength,"*");
        System.out.println("Hello World");
        printBorder(borderlength,borderSymbol);
    }
}
