import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] a=input.split(" ");

        int n = a.length;

        System.out.print("You entered " + n + " command-line argument");
        if (n == 1) {
            System.out.println(".");
        }
        else{
            System.out.println("s.");
        }
    }
    }
