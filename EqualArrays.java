import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numberString = scanner.nextLine().split(" ");
        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }
        String[] numberStringtwo = scanner.nextLine().split(" ");
        int[] numberstwo = new int[numberStringtwo.length];
        for (int i = 0; i < numberStringtwo.length; i++) {
            numberstwo[i] = Integer.parseInt(numberStringtwo[i]);
        }
        int sum = 0;
        int maxLength = 0;
        if (numbers.length < numberstwo.length) {
            maxLength = numberstwo.length;
        } else {
            maxLength = numbers.length;
        }
        for (int i = 0; i < maxLength; i++) {

            if (numbers[i] != numberstwo[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (Arrays.equals(numbers, numberstwo)) {
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Arrays are identical. Sum: " + sum);
        }

    }
}
