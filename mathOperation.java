import java.util.Scanner;

public class mathOperation {
    static void calculator(int a, String command, int b){
        double result =0.0;
        switch (command){
            case "*":
                result=a*b;
                break;
            case "/":
                if (b==0){
                    System.out.println("ERROR");
                    break;
                }else {
                    result = a / b;
                    break;
                }
            case "-":
                result=a-b;
                break;
            case "+":
                result=a+b;
                break;

        }
        System.out.printf("%.2f",result); ///!!! 2 digits

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        int b=Integer.parseInt(scanner.nextLine());
        calculator(a,command,b);


    }
}
