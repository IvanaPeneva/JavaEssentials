import java.util.Scanner;

public class onOneLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //String numbersLine = scanner.nextLine();
        //String [] numbersString = numbersLine.split("");
        String [] numbersString = scanner.nextLine().split(" "); //!!!
        int[] numbers =new int[numbersString.length];
        for(int i=0;i<numbers.length; i++) {
            numbers[i]=Integer.parseInt(numbersString[i]);
        }for (int i=0; i<numbers.length;i++) {
            System.out.println(2*numbers[i]);
        }




    }
}
