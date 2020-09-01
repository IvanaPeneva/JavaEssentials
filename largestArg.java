import java.util.Scanner;

public class largestArg {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int maxOne=Math.max(a,b);
        int maxTwo=Math.max(c,d);
        int maxThree=Math.max(maxOne,e);
        int maxFour=Math.max(maxTwo,maxThree);
        System.out.println(maxFour);
        }
    }

