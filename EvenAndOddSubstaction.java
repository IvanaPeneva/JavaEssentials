import java.util.Scanner;

public class EvenAndOddSubstaction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] numberString = scanner.nextLine().split(" ");
        int sumOdd=0;
        int sumEven = 0;

        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }for (int num:numbers) {
            if (num%2==0) {
                sumOdd+=num;
            }else {
                sumEven+=num;
            }
        }
        System.out.println(sumOdd-sumEven);
    }
}
