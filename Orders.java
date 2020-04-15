import java.util.Scanner;

public class Orders {
    static  void printPrise(String item, int quantity) {
        if (item.equals("coffee")){
            System.out.println(quantity*1.5);
        }else if (item.equals("water")) {
            System.out.println(quantity);
        }else if (item.equals("coke")) {
            System.out.println(quantity * 1.4);
        }else if (item.equals("snacks")) {
            System.out.println(quantity * 2);
        }else {
            System.out.println("No item found");
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String item =scanner.nextLine();
        int quantity=scanner.nextInt();
        printPrise(item,quantity);

    }
}
