import java.util.Scanner;

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String twoIntegers=scanner.nextLine();
        String[] numbers =twoIntegers.split(" ");
        int n=Integer.parseInt(numbers[0]);
        int r=Integer.parseInt(numbers[1]);
        double sum=0;

        for (int i=1; i<=n;i++){
            sum+=1/Math.pow(i,r);


        }
        System.out.println(sum);

    }
}
