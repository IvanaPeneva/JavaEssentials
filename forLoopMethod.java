import java.util.Scanner;

public class forLoopMethod {
    public static void forLoop (int start, int stop) {
        for (int i=start; i<=stop; i++) {
            System.out.print(i);
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int start =scanner.nextInt();
        int stop=scanner.nextInt();
        forLoop(start,stop);
        System.out.println();
        forLoop(23, 40);
    }
}
