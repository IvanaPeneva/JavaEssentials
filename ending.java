import java.util.Scanner;

public class ending {
    static int[] readnextArray(Scanner scanner) {
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=readnextArray(scanner);
        printArray(numbers);

    }

}




