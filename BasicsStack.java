import java.util.ArrayDeque;
        import java.util.Scanner;

public class BasicsStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String> history=new ArrayDeque<>();
        String input=scanner.nextLine();
        while (!input.equals("Home")){
            boolean error=false;
            if (input.equals("back")){
                if (history.size()<2){
                    System.out.println("no previous URLs");
                    // or continue; but sout not working
                    error=true;
                }else{
                    history.pop();
                }
            }
            else{
                history.push(input);
            }if (!error){
                System.out.println(history.peek());
            }
            input=scanner.nextLine();
        }
    }
}
