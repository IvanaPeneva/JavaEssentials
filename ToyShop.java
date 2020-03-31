import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExc = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minnions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double suma = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minnions * 8.2 + trucks * 2;
        int counter = puzzles + dolls + bears + minnions + trucks;
        double disc = 0.0;
        if (counter >= 50) {
            disc = 0.25 * suma;}
        double totalPrise = suma - disc;
        totalPrise-=totalPrise*0.1;

        if (priceExc <= totalPrise) {
            System.out.printf("Yes! %.2f lv left.", totalPrise - priceExc); //!!!
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceExc - totalPrise);
            }

        }
    }