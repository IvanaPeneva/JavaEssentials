import java.util.Scanner;

public class IntersectionOfTwoMatrises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrixOne = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int k = 0; k < line.length; k++) {
                matrixOne[i][k] = line[k].charAt(0); //char
            }
        }
        char[][] matrixTwo = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int k = 0; k < line.length; k++) {
                matrixTwo[i][k] = line[k].charAt(0);

            }
        }
        for (int r = 0; r < matrixOne.length; r++) {
            for (int c = 0; c < matrixTwo[r].length; c++) {
                if (matrixOne[r][c] != matrixTwo[r][c]) {
                    matrixOne[r][c] = '*';

                }
            }
        }
        for (int r = 0; r < matrixOne.length; r++) {
            for (int c = 0; c < matrixTwo[r].length; c++) {
                System.out.print(matrixOne[r][c]+" ");
            }
            System.out.println();
        }

    }
}
