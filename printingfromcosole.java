import java.util.Scanner;

public class printingfromcosole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int num= Integer.parseInt(text);
        System.out.println(num + 13);

    }
}
