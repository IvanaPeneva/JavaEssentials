import java.util.Scanner;

public class Triangle2 {
    static void printRowOfNumbers(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printRowOfNumbers(i);
        }
        for (int i = size - 1; i >= 1; i--) {
            printRowOfNumbers(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size = scanner.nextInt();
        printTriangle(size);

        }

    }

