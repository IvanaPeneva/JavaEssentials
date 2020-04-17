import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class psvm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, -2, -4, 20, 42, 39, -1));
        /*for (int i =0; i<numbers.size();i++){
            if (numbers.get(i)<0){
                numbers.remove(i);
                i--;
            }
        }*///or

        int i = 0;
        while(i<numbers.size()) {
            if (numbers.get(i)<0) {
                numbers.remove(i); //ako mahnem element ostavame na sushtiq index
            }else{
                i++; //ako ne minavame edin index napred
            }
        }
        for (int num:numbers){
            System.out.println(num + " ");
        }
    }
}

