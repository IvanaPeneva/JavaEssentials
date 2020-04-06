public class forEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i=0;i<numbers.length;i+=2)  { //to pass 2
            int number=numbers[i];
            System.out.println(number);
        }
        for (int number :numbers){
            System.out.println(number);
        }for (int number: numbers){
            number=3;
            System.out.println(number);
        } //333333 nothing changes after that in the program

    }
}
