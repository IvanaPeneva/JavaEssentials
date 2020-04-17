import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] parts=scanner.nextLine().split("\\s+"); //for more than one white space

        List<Integer> numbers =new ArrayList<>();
        for (int i=0;i<parts.length;i++){
            numbers.add(Integer.parseInt(parts[i]));
        }
        for (Integer num:numbers){
            System.out.print(num+ " ");
        }

    }
}
