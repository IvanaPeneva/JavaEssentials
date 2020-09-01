public class MatrixWithArrr {
    public static void main(String[] args) {
        int n=4;
        double[][] a=new double[n][n];
        double[][] b=new double[n][n];
        double[][] c=new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        //MULTIPLY MATRICES
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

    }
}
