import java.util.Scanner;

public class BandMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String twoIntegers = scanner.nextLine();
        String[] numbers = twoIntegers.split(" ");
        int n = Integer.parseInt(numbers[0]);
        int width = Integer.parseInt(numbers[1]);
        String q="*  ";




        for (int i=0;i<n;i++){
            for (int k=0;k<n;k++){
                if (i==k){
                   int c=width+1;
                    String repeated=new String(new char[c]).replace("\0",q);
                    System.out.print(repeated);
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }

    }
}
