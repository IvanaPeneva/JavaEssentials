import java.util.Scanner;

public class Triangle {
    static void printRowOfNumbers(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i =1; i<=size; i++) {
            printRowOfNumbers(i);
        }for (int i=size-1;i>=1;i--){
            printRowOfNumbers(i);
        }


    }
}


