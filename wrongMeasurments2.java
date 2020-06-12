import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class wrongMeasurments2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt((Integer::parseInt))
                    .toArray();

        }

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int wrongValue = matrix[r][c];

        ArrayList<Integer>values=new ArrayList<>();
        ArrayList<int[]> indexes=new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] == wrongValue) {
                    int validValue = getValidValue(matrix, i, k, wrongValue);
                    values.add(validValue);
                    indexes.add(new  int[]{i,k});
                }
            }
        }
        for (int i=0;i<values.size();i++){
            matrix[indexes.get(i)[0]][indexes.get(i)[1]]=values.get(i);
        }
        for (int i=0;i<matrix.length;i++){
            for (int k=0;k<matrix[i].length;k++){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }

    }

    private static int getValidValue(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;
        if (isInBounds(row + 1, col, matrix)) {
            if (matrix[row + 1][col] != wrongValue) {
                sum += matrix[row + 1][col];
            }
        }
        if (isInBounds(row - 1, col, matrix) && matrix[row - 1][col] != wrongValue) {
            sum += matrix[row - 1][col];
        }
        if (isInBounds(row , col-1, matrix) && matrix[row][col-1] != wrongValue) {
            sum += matrix[row][col - 1];
        }
        if (isInBounds(row , col+1, matrix) && matrix[row][col+1] != wrongValue) {
            sum += matrix[row][col + 1];
        }
        return sum;
    }

    private static boolean isInBounds(int r, int c, int[][] matrix) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }


}

