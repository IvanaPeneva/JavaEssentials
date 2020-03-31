import java.util.Scanner;

public class textLenght {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text =scanner.nextLine();
        int lenght = text.length();
        System.out.println(lenght);

        char letter = text.charAt(1);
        System.out.println(letter);

    }
}
