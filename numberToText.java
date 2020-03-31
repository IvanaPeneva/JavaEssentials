import java.util.Scanner;

public class numberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 1) {
            System.out.println("eins");
        } else if (n == 2) {
            System.out.println("zwei");
        } else if (n == 3) {
            System.out.println("drei");
        } else if (n == 4) {
            System.out.println("vier");
        } else if (n == 5) {
            System.out.println("feunf");
        } else if (n == 6) {
            System.out.println("sechs");
        } else if (n == 7) {
            System.out.println("sieben");
        } else if (n == 8) {
            System.out.println("acht");
        } else if (n == 9) {
            System.out.println("neun");
        } else {
            System.out.println("mehr als neun");
        }
    }
    }