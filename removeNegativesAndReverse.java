import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int i=0;
        while (i<=numbers.size()-1){
            if (numbers.get(i)<0){
                numbers.remove(numbers.get(i));
                i=0;
            }else{
                i++;
            }

        }
        Collections.reverse(numbers);
        if (numbers.isEmpty()){
            System.out.println("empty");
        }
        else {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }

    }


