import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int i=0;
        int powerOfTwo=1;
        while(i<=n){
            System.out.println(i+ " "+ powerOfTwo);
            powerOfTwo=2*powerOfTwo;
            i++;
        }
    }
}
