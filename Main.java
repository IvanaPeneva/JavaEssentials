import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] numbers =new int[scanner.nextInt()]; //not -1
        for (int i=0; i<numbers.length; i++){
           numbers[i]=scanner.nextInt();

    }
        for (int i=0; i<numbers.length;i++){
            numbers[i] *= 2;

        }
        for(int i=numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }

    }
}
