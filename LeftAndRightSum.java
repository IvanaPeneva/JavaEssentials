import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int sum1=0;
        int sum2=0;
        for(int i=0; i<n; i ++) {
            int num1= Integer.parseInt(scanner.nextLine());
            sum1 += num1;
        }for(int j=0; j<n; j ++) {
            int num3 = Integer.parseInt(scanner.nextLine());
            sum2 += num3 ;
        }if (sum1==sum2) {
            System.out.println("Yes, sum = "+sum1);
        } else {
            int diff= Math.abs(sum1-sum2);
            System.out.println("No, diff = "+ diff);
        }
    }
}
