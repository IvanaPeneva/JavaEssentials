import java.util.Scanner;

public class couponCollectorTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        boolean[] isCollected=new boolean[n];
        int counter=0;
        int distr=0;

        while (distr<n){
            counter++;
            int value= (int) (Math.random() *n);
            if (!isCollected[value]){
                isCollected[value]=true;
                distr++;

            }
        }
        System.out.println(counter);
    }
}
