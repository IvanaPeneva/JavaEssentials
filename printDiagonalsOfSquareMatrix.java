import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class printDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt((Integer::parseInt))
                    .toArray();
        }
        /*for (int row = 0; row < size; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }*///Not the best way but still working
        int[][] newMatrix = new int[2][size];
        for (int r = 0; r < size; r++) {
            //for (int c=0;c<size;c++){
            newMatrix[0][r] = matrix[r][r];

        }
            for (int r = 0; r < size; r++) {
                newMatrix[1][r] = matrix[size - r - 1][r]; //because size doesnt start from 0
            }
            for (int r = 0; r < newMatrix.length; r++) {
                for (int c = 0; c < newMatrix[r].length; c++) {
                    System.out.print(newMatrix[r][c] + " ");
                }
                System.out.println();

            }
        }
    }






