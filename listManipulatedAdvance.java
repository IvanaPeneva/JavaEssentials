import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulatedAdvance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            numbers.add(Integer.parseInt(parts[i]));
        }
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        List<Integer> even = new ArrayList<>();
                        for (int n : numbers) {
                            if (n % 2 == 0) {
                                even.add(n);
                            }
                        }
                        for (int e : even) {
                            System.out.print(e + " ");

                        }
                        System.out.println();
                        break;
                    } else if (tokens[1].equals("odd")) {

                        List<Integer> odd = new ArrayList<>();
                        for (int n : numbers) {
                            if (n % 2 != 0) {
                                odd.add(n);

                            }
                        }
                        for (int o : odd) {
                            System.out.print(o + " ");

                        }
                        System.out.println();
                        break;
                    }

                case "Get":
                    int sum=0;
                    for(int n:numbers){
                        sum+=n;

                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (tokens[1].equals(">=")){
                        for (int n:numbers){
                            if (n>=Integer.parseInt(tokens[2])){
                                System.out.print(n+" ");
                            }

                        }
                        System.out.println();

                    }else if (tokens[1].equals("<=")){
                        for (int n:numbers) {
                            if (n <= Integer.parseInt(tokens[2])) {
                                System.out.print(n + " ");
                            }

                        }
                        System.out.println();

                    }else if(tokens[1].equals(">")){
                        for (int n:numbers) {
                            if (n > Integer.parseInt(tokens[2])) {
                                System.out.print(n + " ");
                            }

                        }
                        System.out.println();


                    }else if (tokens[1].equals("<")){
                        for (int n:numbers) {
                            if (n < Integer.parseInt(tokens[2])) {
                                System.out.print(n + " ");
                            }

                        }
                        System.out.println();


                    }
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
