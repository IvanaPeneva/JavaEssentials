import java.util.*;

public class sort {
    public static void main(String[] args) {
        List<Integer> numbersList=new ArrayList<>(Arrays.asList(1,4, 2, 42,12,-1,3));
        Collections.sort(numbersList);
        Collections.reverse(numbersList);
        for(int n:numbersList) {
            System.out.print(n + " ");
        }
        System.out.println();

        int [] numsArr =new int[]{2,4,6,3,42,69,42,13};
        Arrays.sort(numsArr);
        for (int a:numsArr){
            System.out.print(a+ " ");
        }
        System.out.println();
        List<String> words=new ArrayList<>(Arrays.asList("barbeque", "bira", "agne", "mantiq"));
        Collections.sort(words);
        for (String w:words){
            System.out.println(w+" ");
        }


        }
    }

