import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers =new ArrayList<>(Arrays.asList(2, -2,-4,20,42,39,-1));

        List<Integer>positive=new ArrayList<>();
        for (int number:numbers){
            if (number>0){
                positive.add(number);
            }
        }
        numbers=positive;

        for (int number:numbers){
            System.out.print(number + " ");
        }
    }
}
