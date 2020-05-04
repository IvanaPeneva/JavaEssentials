import java.util.ArrayDeque;
import java.util.ArrayList;

public class queue {
    public static void main(String[] args) {
        //furst in furst out
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.add(5);
        queue.offer(1); //also add but if queue is full returns false

        int el=5;
        el=queue.poll(); //returns null if q is empty
        queue.remove(5); // both remove, returns exception if empty
        int a =0;
        System.out.println(a=queue.peek());
        queue.contains(5); //true or false
        

        Object[] arr=queue.toArray(); //converts queue to arr

        System.out.println(queue);
    }

}
