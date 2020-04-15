import java.util.Scanner;

public class calculationMethods {
    static void printCalculatedResult(String command, int a, int b){
        switch (command){
            case "add":
                System.out.println(a+b);
                break;
            case "subtract":
                System.out.println(a-b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case  "devide":
                System.out.println(a/b);
                break;


        }
        /*if (command.equals("add")){
            System.out.println(a+b);
        }*/
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command =scanner.nextLine();
        int a=scanner.nextInt();
        int b =scanner.nextInt();
        printCalculatedResult(command,a,b);

    }
}
