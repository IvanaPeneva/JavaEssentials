import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleCalculatorMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (int i=0; i<input.length;i++){
            if (Character.isDigit(input[i].charAt(0))){
                stack.push(Integer.parseInt(input[i]));

            }else if (input[i].charAt(0)=='+'){
                addOrSubstract(stack,input[i+1],'+');
                i++;


            }else if (input[i].charAt(0)=='-'){
                addOrSubstract(stack,input[i+1],'-');
                i++;
            }
        }
        System.out.println(stack.peek());

    }
    private static void addOrSubstract(ArrayDeque<Integer> stack, String s,char operation){
        int left=stack.pop();
        int right=Integer.parseInt(s);
        int result=0;
        if(operation=='+'){
            result =left+right;
        }else {
            result =left-right;
        }
        stack.push(result);
    }
}
