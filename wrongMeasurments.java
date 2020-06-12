import java.util.Arrays;
import java.util.Scanner;

public class wrongMeasurments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt((Integer::parseInt))
                    .toArray();

        }

        int surchedRow = scanner.nextInt();
        int surchedCol = scanner.nextInt();
        int wrongValue = matrix[surchedRow][surchedCol];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    int sum = 0;
                    //up
                    if (isInBounds(r - 1, c, matrix)) {
                        if (matrix[r - 1][c] != wrongValue) {
                            sum += matrix[r - 1][c];
                        }
                    }
                    //down
                    if (isInBounds(r + 1, c, matrix)) {
                        if (matrix[r + 1][c] != wrongValue) {
                            sum += matrix[r + 1][c];
                        }

                    }
                    //right
                    if (isInBounds(r, c + 1, matrix)) {
                        if (matrix[r][c + 1] != wrongValue) {
                            sum += matrix[r][c + 1];
                        }
                    }
                    //left
                    if (isInBounds(r, c - 1, matrix)) {
                        if (matrix[r][c - 1] != wrongValue) {
                            sum += matrix[r][c - 1];
                        }
                    }
                    matrix[r][c] = sum;
                }
            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

    }

    private static boolean isInBounds(int r, int c, int[][] matrix) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
