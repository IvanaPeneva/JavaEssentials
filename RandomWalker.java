import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=0;
        int b=0;
        int counter=0;

        while (Math.abs(a)+Math.abs(b)!=n) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(0);
            numbers.add(-1);
            Collections.shuffle(numbers);
            int c= numbers.get(0);
            b=c+b;

            if (c == 0) {
                ArrayList<Integer> numbersTwo = new ArrayList<Integer>();
                numbersTwo.add(1);
                numbersTwo.add(0);
                numbersTwo.add(-1);
                Collections.shuffle(numbersTwo);
                int d = numbersTwo.get(0);
                a=a+d;
            }
            counter++;
            System.out.println("("+a+", "+b+")");
        }
        System.out.println("steps = "+counter);

    }
}


