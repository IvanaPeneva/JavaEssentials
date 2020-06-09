import java.util.Scanner;

public class readingMatrixScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=Integer.parseInt(scanner.nextLine());
        int cols= Integer.parseInt(scanner.nextLine());
        int[][] matrix=new int[rows][cols];
        for (int row=0; row<rows;row++){
            String[] inputTokens=scanner.nextLine().split(" ");
            for (int col=0; col<cols;col++){
                matrix[row][col]=Integer.parseInt(inputTokens[col]);
            }
        }

    }
}
