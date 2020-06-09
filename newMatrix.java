import java.util.ArrayList;
import java.util.Arrays;

public class newMatrix {
    public static void main(String[] args) {
        int[][] intMatrix = new int[3][2]; //hor|=3 vert_=4
        float[][] floatMatrix = new float[8][2];
        String[][][] stringCube = new String[5][5][5];

        System.out.println(Arrays.toString(intMatrix[0]));
        //first hor|= intMatrix[0]


        int[][] matrix = { //[2][4]
                {1, 2, 3, 4}, //row_0 values
                {5, 6, 7, 8} //row 1 values
        };
       /* for (int row=0;row<matrix.length;row++){
            int[] arr=matrix[row]; //moje da bude zapisano kato arr
            for (int col=0;col<arr.length;col++){
                System.out.print(arr[col]+ ", ");
            }
            System.out.println();
        }*/
        for (int row=0; row<matrix.length;row++){
            for (int col=0; col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+", ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(matrix[0]));
        //System.out.println(Arrays.toString(matrix[1]));

        int element=matrix[1][1]; //dostupvane na element
        System.out.println(element);

    }
}
