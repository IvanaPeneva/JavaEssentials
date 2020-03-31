import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        if (pass.equals("street")) {
           System.out.println("Welcome");
       }
       //do not use this if ("str" == pass){
         //   System.out.println("Welcome Chef ");
        //}
        else {
            System.out.println("Wrong password");
        }

    }
}
