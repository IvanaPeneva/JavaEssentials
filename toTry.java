import java.util.Scanner;

public class toTry {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String nummberLine=scanner.nextLine();
        String [] numberString=nummberLine.split(" ");

        int [] numbers= new int[numberString.length];
        for (int i=0; i<numberString.length; i++){
            numbers[i]=Integer.parseInt(numberString[i]);
        }for (int i=0; i<numbers.length;i++){
            System.out.println(2* numbers[i]);
        }
    }
}
