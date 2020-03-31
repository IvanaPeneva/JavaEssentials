import java.util.Scanner;

public class nSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int max=-9999999;
        int min= 9999999;
        for(int i=0; i<n; i ++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num>max){
                max=num;
            }if (num<min){
                min=num;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}
