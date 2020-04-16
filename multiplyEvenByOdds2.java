import java.util.Scanner;
//Not working

public class multiplyEvenByOdds2 {
    static void getSumOfEven (int i){

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] console=scanner.nextLine().split("");
        int[] numbers=new int[0];
        /*if(console[0].equals("-")){
            int[] numbers=[console.length-1];

        }else{
            int[] numbers=new int[console.length];
        }*/

        int evenSum=0;
        int oddSum=0;
        for (int i=0;i<console.length;i++){
            if (console[0].equals("-")){
                numbers[i]=Integer.parseInt(console[i-1]); //!!!

            }
            else {
                numbers[i] = Integer.parseInt(console[i]);
            }
            if (numbers[i]%2==0){
                evenSum+=numbers[i];
            }else{
                oddSum+=numbers[i];
            }

        }int result =evenSum*oddSum;
        System.out.println(result);
    }
}
