import java.util.Scanner;

public class graterOfTwoValues {
    static int getMaxInt(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }static char getMaxChar(char a,char b){
        if (a>b){ //char and int are all the same
            return a;
        }return b;
    }
    static String getMaxString(String a, String b){
        if(a.compareTo(b)>=0){
            return a;
        }return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equals("int")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(getMaxInt(a,b));

        } else if (command.equals("char")){
            char a=scanner.next().charAt(0);
            char b=scanner.next().charAt(0);
            System.out.println(getMaxChar(a,b));
        }else if (command.equals("string")) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(getMaxString(a,b));
        }

    }
}
