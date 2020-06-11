import java.util.Arrays;
import java.util.Scanner;

public class maxSum2x2Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowasAndCols= Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows=rowasAndCols[0];
        int cols=rowasAndCols[1];
        int[][] matrix=new int[rows][cols];
        for (int row=0; row<rows;row++){
            String[] inputTokens=scanner.nextLine().split(", ");
            for (int col=0; col<cols;col++){
                matrix[row][col]=Integer.parseInt(inputTokens[col]);
            }
        }
        int bestSum=Integer.MIN_VALUE;

        int[][]maxMatrix=new int[2][2];
        for (int row=0;row<matrix.length-1;row++){ //-1 !!! because of the borders
            for (int col=0;col<matrix[row].length-1;col++){
                int sum=matrix[row][col]+matrix[row][col+1]+
                        matrix[row+1][col]+matrix[row+1][col+1];
                if (sum>bestSum){
                    bestSum=sum;
                    maxMatrix[0][0]=matrix[row][col];
                    maxMatrix[0][1]=matrix[row][col+1];
                    maxMatrix[1][0]=matrix[row+1][col];
                    maxMatrix[1][1]=matrix[row+1][col+1];

                }
            }
        }
        for (int r=0;r<maxMatrix.length;r++){
            for(int c=0;c<maxMatrix[r].length;c++) {
                System.out.print(maxMatrix[r][c] + " ");

            }
            System.out.println();
        }
        System.out.println(bestSum);
        }
    }