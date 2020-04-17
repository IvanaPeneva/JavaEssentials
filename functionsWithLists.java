import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class functionsWithLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> inputNumbers =new ArrayList<>(Arrays.asList(1, 5, -10, 15, 13));
        inputNumbers.add(8); //in the back or //inputNumbers.add(inputNumbers.size(),8);
        inputNumbers.add(0,7);//7,1,5,-10...
        inputNumbers.set(2,42); //set 5->42
        inputNumbers.remove(3); //-10
        inputNumbers.remove( 0);//1 42 15 13 !!! removes 7

        List<String> names =new ArrayList<>();
        names.add("Ahinora");
        names.add("Djavaila");
        names.add("Navi");
        names.remove("Djavaila"); //or names.remove(1)
        for (String n:names){
            System.out.println(n);
        }
        List<Integer> listInt=new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.remove((Integer)2); //for number
        listInt.remove(0); //for index
        System.out.println(listInt.contains(3));
        for (int n:listInt){
            System.out.println(n);
        }


        /*for (int i=0; i<inputNumbers.size();i++){
            System.out.print(inputNumbers.get(i));
        }*/
        for (int n:inputNumbers){
            System.out.print(n +" ");
        }

        /*List<Integer> inputNumbers=new ArrayList<>();
        inputNumbers.add(1);
        inputNumbers.add(5);
        inputNumbers.add(-10)
         */

    }
}
