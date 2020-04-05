public class ReverceAnArrayOfIntegers {
    public static void main(String[] args) {
        int[] numbers = {13, 42, 1, 69, 2};
        for (int i = 0; i < numbers.length / 2; i++) {
            int oppositeIndex = numbers.length - 1 - i;
            int oldNumbers = numbers[i];
            numbers[i] = numbers[oppositeIndex];
            numbers[oppositeIndex] = oldNumbers;

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
