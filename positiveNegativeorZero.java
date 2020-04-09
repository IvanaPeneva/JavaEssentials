import java.util.Scanner;

public class positiveNegativeorZero {
    public static void positiveNegativeZero (int n) {
        if (n>0) {
            System.out.println("positive");

        }else if (n<0){
            System.out.println("negative");
        }else{
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        positiveNegativeZero(n); //or
        //positiveNegativeZero(Integer.parseInt(scanner.nextLine()));
    }
}
