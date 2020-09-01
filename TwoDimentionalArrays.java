public class TwoDimentionalArrays {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        double[][] a=new double[m][n];
        for (int i=0;i<m;i++){
            for (int k=0;k<n;k++){
                a[i][k]=0;
            }
        }
        int[][] b={
                {99, 85, 98, 0},
                {100,78,67, 89},
                {56, 67, 34, 230},
                {23, 8, 20, 1}
        };
        //There is no requirement that all rows in a two-dimensional array have the same length
        // ragged arr
        //if a is a ragged, more care like this
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //multidimensional arrays
        int[][][] multyArr=new int[n][n][n];
        //and then refer to an entry with code like a[i][j][k].


    }
}
