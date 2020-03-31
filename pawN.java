import java.util.Scanner;

public class pawN {
    public static void main(String[] args) {
        //for (int i=0; i<=10; i+=2) {

           // System.out.println(Math.pow(2, i));
        //}
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        //int num=1;
        for (int i=0; i<=n; i+=2) {
            System.out.println(Math.pow(2,i));
            //num=num*2*2;

        }

    }
}
