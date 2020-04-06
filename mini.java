import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nummberLine = scanner.nextLine();
        String[] numberString = nummberLine.split(" ");

        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }
    }
}
