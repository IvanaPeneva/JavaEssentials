import java.util.Scanner;

public class findTheRealQueenChess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=8;
        char[][] board=new char[size][size];
        for (int i=0;i<size;i++){
            String[] line =scanner.nextLine().split(" ");
            for (int k=0;k<line.length;k++){
                board[i][k]=line[k].charAt(0); //for char

            }
        }
        for (int r=0;r<size;r++){
            for (int c=0;c<size;c++){
                if (board[r][c]=='q'){
                    boolean isColValid=checkQueenCol(board,c);
                    boolean isRowValid=checkQueenRow(board,r);
                    boolean isMainDiagonalValidUpAndLeft =checkMainDiagonalUpLeft(board, r, c);
                    boolean isMainDiagonalValidDownAndRight=checkMainDiagonalDownAndRight(board,r,c);
                    boolean isSecondaryDiagonalValidUpAndRight =checkSecondaryDiagonalUpAndRight(board, r, c);
                    boolean isSecondaryDiagonalValidDownAndLeft=checkSecondaryDiagonalDownAndLeft(board,r,c);
                    if (isColValid && isRowValid &&isMainDiagonalValidDownAndRight
                            && isMainDiagonalValidUpAndLeft && isSecondaryDiagonalValidDownAndLeft
                        && isSecondaryDiagonalValidUpAndRight){
                        System.out.println(r+" "+ c);
                        return;
                    }


                }
            }
        }

    }
    private static boolean checkSecondaryDiagonalDownAndLeft(char[][] board, int row, int col) {
        row++;
        col--;

        while (row<8 && col>=0){
            if (board[row++][col--]=='q'){ //interesting written
                return false;
            }
        } return true;
    }

    private static boolean checkSecondaryDiagonalUpAndRight(char[][] board, int row, int col) {
        row--;
        col++;

        while (row>=0 && col<8){
            if (board[row--][col++]=='q'){ //interesting written
                return false;
            }
        } return true;
    }

    private static boolean checkMainDiagonalDownAndRight(char[][] board, int row, int col) {
        row++;
        col++;

        while (row<8 && col<8){
            if (board[row++][col++]=='q'){ //interesting written
                return false;
            }
        } return true;

    }

    private static boolean checkMainDiagonalUpLeft(char[][] board,int row, int col) {

        row--;
        col--;

        while (row>=0 && col>=0){
            if (board[row--][col--]=='q'){ //interesting written
                return false;
            }
         } return true;

    }

    private static boolean checkQueenRow(char[][] board, int r) {
        int queens=0;
        for (int i=0;i<board.length;i++){
            char symbol=board[r][i];
            if (symbol=='q'){
                queens++;

            }
        }
        return queens==1;


    }

    private static boolean checkQueenCol(char[][] board, int col) {
        int queens=0;
        for (int i=0;i<board.length;i++){
            char symbol=board[i][col];
            if (symbol=='q'){
                queens++;

            }
        }
        return queens==1;

        }

    }

