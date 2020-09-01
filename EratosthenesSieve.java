import java.util.Scanner;

public class EratosthenesSieve {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean[] isPrime=new boolean[n+1];
        for (int i=2;i<=n; i++){
            isPrime[i]=true;
        }
        for (int factor=2; factor*factor<=n;factor++){
            if (isPrime[factor]){
                for (int k=factor;factor*k<=n;k++){
                    isPrime[factor*k]=false;
                }
            }
        }
        int primes=0;
        for (int i=2;i<=n;i++){
            if (isPrime[i]){
                primes++;
            }
        }
        System.out.println(primes);


    }
}
