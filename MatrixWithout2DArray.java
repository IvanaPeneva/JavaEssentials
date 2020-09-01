import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
//transpose matrix
//transponirane na matrici
public class MatrixWithout2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                a[i][k] = n * i + k; //from 1 to end value
            }
        }
        /*System.out.println("usual");


        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[i][k]+ "  ");
            }
            System.out.println();

        }
        */

        System.out.println("BEFORE");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i]; //transpose
                a[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("AFTER");
        for (int i=0;i<n;i++){
            for (int k=0;k<n;k++){
                System.out.printf("%4d",a[i][k]);
            }
            System.out.println();
        }


    }
}
