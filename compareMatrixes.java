

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class compareMatrixes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowasAndCols= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows=rowasAndCols[0];
        int cols=rowasAndCols[1];
        int[][] matrixOne= readMatrix(rows,cols,scanner);
        rowasAndCols= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        rows=rowasAndCols[0];
        cols=rowasAndCols[1];
        int[][] matrixTwo=readMatrix(rows,cols,scanner);
        if(areMetrixEqual(matrixOne,matrixTwo)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }



    }
    private static int[][] readMatrix(int row,int col, Scanner scanner){
        int[][] matrix= new int[row][col]; //dvumeren
        for (int r=0;r<row; r++){
            String[] elements =scanner.nextLine().split(" ");
            for (int c=0;c<elements.length;c++){
                int number =Integer.parseInt(elements[c]);
                matrix[r][c]=number;
            }

        }
       return matrix;

    }private static boolean areMetrixEqual(int[][]metrixOne,int[][]metrixTwo ){
        boolean areEqual=true;
        if (metrixOne.length !=metrixTwo.length){
            areEqual=false;
        }else {
            for (int r = 0; r < metrixOne.length; r++) {
                int[] firstArray = metrixOne[r];
                int[] secondArray = metrixTwo[r];
                if (firstArray.length != secondArray.length) {
                    areEqual = false;
                    break;

                }
                else {
                    for (int i=0;i<firstArray.length;i++){
                        int first=firstArray[i];
                        int second=secondArray[i];
                        if (first!=second){
                            return false;
                        }
                    }
                }
            }
        }


        return areEqual;

    }

}
