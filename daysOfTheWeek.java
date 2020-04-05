import java.util.Scanner;

public class daysOfTheWeek {
    public static void main(String[] args) {
        String [] days= new String[] {"Monday", "Tuesday", "Wednesday",
                "Thursday","Friday", "Saturday","Sunday"};
        Scanner scanner=new Scanner(System.in);
        int day =Integer.parseInt(scanner.nextLine());
        if (day>=1 && day<=7) {
            System.out.println(days[day-1]);
        }else{
            System.out.println("Invalid day");
        }
    }
}
