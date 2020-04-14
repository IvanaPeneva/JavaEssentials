import java.util.Scanner;

public class basicReturn {
    static int printSum(int a, int b){
        return a+b; //after return the method stops

    }
    static int getAbs (int number){ //int not void for return
        if(number>=0) {
            return number;
        }//else { w or wo it becsause of return
            return -number;
        //}
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        printSum(39,3);
        getAbs(-42);
        int x =getAbs(-4);
        System.out.println(x);
        int y=printSum(3,5);
        System.out.println(y);
        int sum=0;
        for (int i =0;i<10;i++){
            sum+=getAbs(scanner.nextInt());
        }


    }
}
