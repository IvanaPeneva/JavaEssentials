import java.util.Scanner;

public class withComma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nummberLine = scanner.nextLine();
        String[] numberString = nummberLine.split(" ");
        String joined = String.join(" \n",numberString);
        System.out.println(joined);

    }
}

