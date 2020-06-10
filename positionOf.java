import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class positionOf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        scanner.nextLine();
        int[][] matrix =new int[rows][cols];
        for (int i=0;i<rows;i++) {/*matrix[i]= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();*/
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int number=scanner.nextInt();
        boolean checker=false;
        for (int r=0;r<matrix.length;r++){
            for (int c=0;c<matrix[r].length;c++){ //!
                if (matrix[r][c]==number){
                    System.out.println(r+ " "+c);
                    checker=true;
                }

            }if (checker==false) {
                System.out.println("not found");
                break;
            }
        }


    }
}
