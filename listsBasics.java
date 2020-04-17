import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listsBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> inputNumbers=new ArrayList<>();

        int number =scanner.nextInt();
        while (number !=-1){
            inputNumbers.add(number);
            number=scanner.nextInt();
        }

        for (int i=inputNumbers.size()-1;i>=0;i--){
            System.out.print(inputNumbers.get(i)+" ");
        }
        System.out.println();
        for (int inputNumber:inputNumbers){
            System.out.print(inputNumber*2+ " ");
        }
    }


    }


