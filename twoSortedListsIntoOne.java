import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class twoSortedListsIntoOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer>firstList=new ArrayList<>(Arrays.asList(1,4,5));
        List<Integer> secondList=new ArrayList<>(Arrays.asList(2,3,6,7,8));
        List<Integer> merged=new ArrayList<>();
        while(!firstList.isEmpty() || !secondList.isEmpty()) {
            if (firstList.isEmpty()){
                merged.add(secondList.remove(0));
            }else if (secondList.isEmpty()) {
                merged.add(firstList.remove(0));
            }else{ //fL=sL
                if(firstList.get(0)<secondList.get(0)){
                    merged.add(firstList.remove(0));
                }else{
                    merged.add(secondList.remove(0));

                }
            }
        }for(int m:merged){
            System.out.print(m+" ");
        }
    }
}
