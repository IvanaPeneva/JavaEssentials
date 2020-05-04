import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> bits = new ArrayDeque<>();
        if (number == 0) {
            System.out.print(0);
            return;
        }
        while (number > 0) {

            int leftover = number % 2;
            bits.push(leftover);
            number = number / 2; //returns int
        }

        int size = bits.size();
        for (int i = 0; i < size; i++) {
            System.out.print(bits.pop());


        }
    }


}

