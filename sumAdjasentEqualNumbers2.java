import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sumAdjasentEqualNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(8,2,2,4,8,16));
        int i = 0;
        while(i<numbers.size()-1) { //nqma sledvashto za i+1
            if (numbers.get(i).equals(numbers.get(i+1))) {
                int sum=numbers.get(i)+numbers.get(i+1);
                numbers.set(i,sum);
                numbers.remove(i+1); //ako mahnem element ostavame na sushtiq index
                i=0;

            }else{
                i++; //ako ne minavame edin index napred
            }
        } for (int num:numbers){
            System.out.print(num + " ");
        }

    }
}
