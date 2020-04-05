import java.util.Scanner;

public class whitComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nummberLine = scanner.nextLine();
        String[] numberString = nummberLine.split(" ");
        for (int i=0;i<numberString.length;i++) {
            System.out.print(numberString[i]);
            if (i<numberString.length-1) {
                System.out.print(", ");}
            }
        }


    }

