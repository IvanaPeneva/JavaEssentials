import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] parts=scanner.nextLine().split("\\s+"); //for more than one white space

        List<Integer> numbers =new ArrayList<>();
        for (int i=0;i<parts.length;i++){
            numbers.add(Integer.parseInt(parts[i]));
        }
        int i = 0;
        while(i<numbers.size()-1){
            int sum=numbers.get(i)+ numbers.get(numbers.size()-1);
            numbers.set(i,sum);
            numbers.remove(numbers.size()-1);
            i++;

        }for (int num:numbers){
            System.out.print(num +" ");
        }
    }
}
