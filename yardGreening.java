import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);;
         double m2=Double.parseDouble(scanner.nextLine());
         double area = m2*7.61;
         double disc = area*0.18;
         double finalPrise= area-disc;


        System.out.printf("The final price is: %.2f lv.", finalPrise);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", disc);

}
}

