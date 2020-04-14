import java.util.Scanner;

public class repeatString {
    static String repeatString(String s,int repeatCount){
        String[] repeatArr=new String[repeatCount];
        for (int i=0; i<repeatArr.length;i++){
            repeatArr[i]=s;
        }return String.join("", repeatArr);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s =scanner.nextLine();
        int repeatCount=scanner.nextInt();
        String done=repeatString(s,repeatCount);
        System.out.println(done);



    }
}
