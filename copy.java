import java.util.Arrays;
import java.util.Scanner;



    public class copy {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int rows = Integer.parseInt(scanner.nextLine());
            int[][] matrix = new int[rows][];

            for (int r = 0; r < rows; r++) {
                matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt((Integer::parseInt))
                        .toArray();

            }
            String[] surched = scanner.nextLine().split(" ");
            int surchedRow = Integer.parseInt(surched[0]);
            int surchedCol = Integer.parseInt(surched[1]);
        /*or
        int surchedRow=scanner.nextInt();
        int surchedCol=scanner.nextInt();
         */


            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                }
            }
        }
    }



