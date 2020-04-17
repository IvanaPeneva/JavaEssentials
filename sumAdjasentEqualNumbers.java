import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjasentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] parts=scanner.nextLine().split("\\s+"); //for more than one white space

        List<Integer> numbers =new ArrayList<>();
        for (int i=0;i<parts.length;i++){
            numbers.add(Integer.parseInt(parts[i]));
        }

        for(int i=0;i<numbers.size()-1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;

            }
        }

            for (int num:numbers){
                System.out.print(num + " ");
            }
        }
    }

