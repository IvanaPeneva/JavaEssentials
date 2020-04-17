import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] inputNumbers=new int[100];
        int counter=0;
        int number=scanner.nextInt();
        while (number>=0){
            inputNumbers[counter]=number;
            counter++;
            number=scanner.nextInt();

        }
        for (int i=counter-1;i>=0;i--){  //printing from the back
            System.out.print(inputNumbers[i]+" ");
        }

    }
}
