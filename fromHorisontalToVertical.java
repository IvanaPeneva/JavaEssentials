import java.util.Scanner;

public class fromHorisontalToVertical {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text = scanner.nextLine();
        int l = text.length();
        for (int i=0; i<=l-1; i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}
