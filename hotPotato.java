import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] children= scanner.nextLine().split(" ");
        int n =Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue=new ArrayDeque<>();
        Collections.addAll(queue,children); //array int queue

        while(queue.size()>1){
            for (int i=0;i<n-1;i++) {
                    String child = queue.remove(); //or poll
                    queue.offer(child);
                }
            String name=queue.remove();
            System.out.println("Removed "+name);
            }
        System.out.println("Last is "+queue.peek());


        }

    }


