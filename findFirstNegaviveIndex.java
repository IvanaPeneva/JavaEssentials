public class findFirstNegaviveIndex {
    static int findFirstNegativeIndex(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int num = numbers[i];
            if (num < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {13, -42, 68, 113, 10};
        int firstNegative = findFirstNegativeIndex(numbers);
        if (firstNegative==-1){
            System.out.println("No negative number");
        }else{
        System.out.println(numbers[firstNegative]);
    }
    }

}

