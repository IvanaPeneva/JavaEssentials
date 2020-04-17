import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IntegersList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String values=scanner.nextLine();
        List<String> items= Arrays.stream(values.split(" ")).collect(Collectors.toList());
        List<Integer> nums =new ArrayList<>();
        for (int i=0;i<items.size();i++){
            nums.add(Integer.parseInt(items.get(i)));
        }
        for (int num:nums) {
            System.out.print(num+" ");
        }

    }
}
