import java.util.Scanner;

public class miniInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersString = scanner.nextLine().split(" "); //!!!
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        } //!!! dont forget
        int currnum = numbers[0]; //!!!
        for (int num : numbers) {
            if (num < currnum) {
                currnum = num;
                }
            }
            System.out.println(currnum);
        }

}
