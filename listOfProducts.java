import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listOfProducts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<String> words=new ArrayList<>();
        for(int i=0;i<n;i++){
            String word = scanner.nextLine();
            words.add(word);
        }
        Collections.sort(words);
        for (int i=0;i<words.size();i++){
            int number=i+1;
            System.out.print(number+"."+words.get(i)+ " ");
            //or System.out.println();
            //System.out.printf("%d.%s%n",i+1,words.get(i));

        }
    }

}
