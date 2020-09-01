import java.util.Scanner;

public class couponCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] isCollected = new boolean[n];
        int count=0;
        int distinct=0;
        while (distinct<n){
            int value=(int) (Math.random() *n);
            count++;
            if(!isCollected[value]){
                distinct++;
                isCollected[value]= true;
            }
        }
        System.out.println(count);



    }
}
