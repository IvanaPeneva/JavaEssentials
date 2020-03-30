import java.util.Scanner;

public class informatinPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();


        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, secondName, age, town);
        System.out.println();
        System.out.println("You are " + firstName +" "+ secondName + ", a " + age + "-years old person from " + town + ".");
    }
}
