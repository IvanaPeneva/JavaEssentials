import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipilationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            numbers.add(Integer.parseInt(parts[i]));
        }
        String input=scanner.nextLine();
        while(!input.equals("end")){

            String[] tokens=input.split(" ");

            switch (tokens[0]){
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.parseInt(tokens[1]));
                    break;
                case "RemoveAt":
                    int n=Integer.parseInt(tokens[1]);
                    numbers.remove(n);
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(tokens[2]),Integer.parseInt(tokens[1]));
                    break;

            }input=scanner.nextLine();

        }
        for (int n:numbers){
            System.out.print(n+" ");
        }

    }
}
