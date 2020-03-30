import java.util.Scanner;

public class doingProjects {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();
        int prj = Integer.parseInt(scanner.nextLine());
        int work=prj*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, work,prj);

    }
}
