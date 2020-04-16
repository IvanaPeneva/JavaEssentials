import java.util.Scanner;

public class multiplyEvenByOdds {
    static void multiplyEvenAndOdd(String[] console, int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < console.length; i++) {
            numbers[i] = Integer.parseInt(console[i]);
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }

        }
        int result = evenSum * oddSum;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] console = scanner.nextLine().split("");
        int[] numbers = new int[console.length];
        multiplyEvenAndOdd(console,numbers);
    }
}

