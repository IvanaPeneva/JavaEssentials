import java.util.Scanner;

public class Euclid {
    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int d  = gcd(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d);

    }
}


