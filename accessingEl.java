public class accessingEl {
    public static void main(String[] args) {
        int[][] array=new int[3][4];
        for (int row=0; row<array.length;row++)
            for (int col=0; col<array[0].length;col++)
                array[row][col]=row+col;
    }
}
