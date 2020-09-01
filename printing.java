import java.util.Scanner;

public class printing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;

        for (int i=0;i<n;i++){
            int value=scanner.nextInt();
            sum+=value;
        }
        System.out.println(sum);




    }
}
