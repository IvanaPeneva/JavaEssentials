public class local {
    static int findFirstNegative(int[] numbers) {
        for (int num : numbers) {
            if (num < 0) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []numbers= {13, 42,-68,113,10};
        int firstNegative=findFirstNegative(numbers);
        if (firstNegative==0){
            System.out.println("No negative number found");
        }else{
        System.out.println(firstNegative);
    }
    }
}
