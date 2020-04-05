import java.util.Scanner;

public class numsToStringWithComma {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        String[] strings = new String[numbers.length];
        for (int i=0;i<numbers.length;i++) {
            strings[i]=String.valueOf(numbers[i]);
        }String joined =String.join(" -> ",strings);
        System.out.println(joined);

        for (int i=0;i<numbers.length;i++) {
            System.out.print(strings[i]);
            if (i<strings.length-1) {
                System.out.print(", ");
            }
        }
    }
}
