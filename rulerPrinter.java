import java.util.Scanner;

public class rulerPrinter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String ruler="0 ";
        for(int i=1; i<=n;i++){
            ruler=ruler+" "+i+ " ";
        }
        System.out.println(ruler);

    }
}
