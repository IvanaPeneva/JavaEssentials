import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] parts=scanner.nextLine().split("\\s+");

        List<Integer> numbers =new ArrayList<>();
        for (int i=0;i<parts.length;i++){
            numbers.add(Integer.parseInt(parts[i]));
        }
        String[] partsTwo=scanner.nextLine().split("\\s+");

        List<Integer> numbersTwo =new ArrayList<>();
        for (int i=0;i<partsTwo.length;i++){
            numbersTwo.add(Integer.parseInt(partsTwo[i]));
        }
        List<Integer> merged=new ArrayList<>();
        int maxSize=Math.max(numbers.size(), numbersTwo.size());
        for (int i=0;i<maxSize;i++){
            if(i<numbers.size()) {
                merged.add(numbers.get(i));
            }/*else {
                for (int j = i; j < numbers.size(); i++){
                    merged.add(numbers.get(j)); ///no need to use
            }
            }*/
            if (i<numbersTwo.size()) {
                merged.add(numbersTwo.get(i));
            }/*else {
                for (int j = i; j < numbersTwo.size(); i++){
                    merged.add(numbersTwo.get(j));
                }
            }*/

                }

        for (int num:merged){
            System.out.print(num+" ");
        }
    }
}
