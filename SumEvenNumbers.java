import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numberString = scanner.nextLine().split(" ");
        int sumEven=0;

        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }for(int num:numbers) {
            if(num %2!=1) {
                sumEven +=num;
            }
        }
        System.out.println(sumEven);
    }
}
