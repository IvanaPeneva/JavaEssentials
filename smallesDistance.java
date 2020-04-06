public class smallesDistance {
    public static void main(String[] args) {
        int[] numbers = {3,5,7,9,11};
        int evenSum=0;
        int oddSum=0;
        for (int num:numbers) {
            if (num%2==0) {
                evenSum +=num;
            }else {
                oddSum+=num;
            }
        }

        System.out.println(evenSum-oddSum);
    }
}
