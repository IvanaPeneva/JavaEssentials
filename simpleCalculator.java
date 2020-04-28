import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");
        for (int i=0; i<input.length;i++){
            if (Character.isDigit(input[i].charAt(0))){
                stack.push(Integer.parseInt(input[i]));

            }else if (input[i].charAt(0)=='+'){
                int left=stack.pop();
                int right=Integer.parseInt(input[i+1]);
                int result=left+right;
                stack.push(result);
                i++;


            }else if (input[i].charAt(0)=='-'){
                Integer left=stack.pop();
                Integer right=Integer.parseInt(input[i+1]);
                Integer result=left-right;
                stack.push(result);
                i++;
            }
        }
        System.out.println(stack.peek());

    }
}
