import java.util.Scanner;

public class change {
    static void change(int x){
        x=3;
    }
    static void change(int[] arr){
        arr[0]=42;
    }
    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=5;
        change(a);
        System.out.println(a);

        int[]numbers=new int[]{1,2,3};
        change(numbers);
        printArray(numbers);

    }
}
