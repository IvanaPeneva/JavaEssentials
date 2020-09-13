import java.util.Scanner;

public class analysisOfAlgoritm {
    public static void main(String[] args) {
        double start = System.currentTimeMillis() / 1000.0;
        Scanner scanner = new Scanner(System.in);
        String[] numberString = scanner.nextLine().split(" ");

        int[] numbers = new int[numberString.length];
        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }

        int counter = 0;
        int n = numberString.length;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                for (int m = k + 1; m < n; m++) {
                    if (numbers[i] + numbers[k] + numbers[m] == 0) {
                        counter++;
                        System.out.println(numbers[i]+ " "+numbers[k]+" "+ numbers[m]);
                    }


                }
            }
        }

            double now = System.currentTimeMillis() / 1000.0;
            System.out.println(counter);
            System.out.println(now - start);
            //formatating
            System.out.printf("%d (%.2f seconds)\n", counter, now - start);
        }

    }


