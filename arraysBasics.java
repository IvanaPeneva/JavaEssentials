import java.util.Scanner;

public class arraysBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[]{12, 13, 14}; //can also be int[] numbers = {12, 13, 14};
        System.out.println(numbers[0]);
        numbers =new int[]{14, 15, 16}; //changes the array
        System.out.println(numbers[1]);
    }
}
