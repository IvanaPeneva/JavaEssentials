import java.util.Scanner;

public class sumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] sizes=scanner.nextLine().split(", ");

        int rows=Integer.parseInt(sizes[0]);
        int cols=Integer.parseInt(sizes[1]);
        System.out.println(rows);
        System.out.println(cols);
        int sum=0;
        for (int i=0;i<rows;i++){
            String[] numbers=scanner.nextLine().split(", ");

            for (String num:numbers){
                int numINT=Integer.parseInt(num);
                sum+=numINT;
            }
        }
        System.out.println(sum);








    }
}
