import java.util.Scanner;

public class smartLily {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        double washmashPrise= Double.parseDouble(scanner.nextLine());
        int toyPrise=Integer.parseInt(scanner.nextLine());
        double suma=0;
        int counter=0;
        int counterToys=0;
        for (int i=1; i<=age; i++) { //they give her gifts from the 1 b-day. the age should be ==//
            if (i%2==0) {
                counter+=1;
                suma += (counter * 10) - 1;
            }else {
                counterToys+=1;
            }
        }double moneyfromtoys=counterToys*toyPrise;
        suma+=moneyfromtoys;
        if (suma>=washmashPrise){
            double rest =suma-washmashPrise;
            System.out.printf("Yes! %.2f ", rest);
        }else {
            double diff = washmashPrise - suma;
            System.out.printf("No! %.2f ", diff);
        }

    }
}
