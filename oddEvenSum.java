import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int Oddsum=0;
        int Evensum=0;
        for(int i=0; i<n; i ++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                Oddsum+=num;
            }else
                Evensum+=num;
        }if (Oddsum==Evensum) {
            System.out.println("Yes");
            System.out.println("Sum = "+Oddsum);
        }else{
            int diff= Math.abs(Oddsum-Evensum);
            System.out.println("No");
            System.out.println("Diff = "+ diff);
        }

    }
}
