import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numberString = scanner.nextLine().split(" ");

        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);

        }

        while (numbers.length > 1) {
            int concidensed[] = new int[numbers.length];
            int counter = 0;


            for (int i = 0; i < numbers.length - 1; i++) {
                concidensed[i] = numbers[i] + numbers[i + 1];
            }
            for (int k=0; k<concidensed.length;k++) {
                if (concidensed[k] > 0) {
                    counter++;
                }
            }
            numbers=new int[counter];

            for( int i=0; i<numbers.length; i++) {
                numbers[i]=concidensed[i];
            }

            }System.out.println(numbers[0]);


    }
}

