import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // read in the command-line argument
        int n =scanner.nextInt();

        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= n/2) {
            power *= 2;
        }

        // check for presence of powers of 2 in n, from largest to smallest
        while (power > 0) {

            // power is not present in n
            if (n < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                System.out.print(1);
                n -= power;
            }

            // next smallest power of 2
            power /= 2;
        }

        System.out.println();

    }

}
