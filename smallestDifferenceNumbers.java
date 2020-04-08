//not working right
public class smallestDifferenceNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 12, 37, 40, 4};
        int minDiff=numbers[0]-numbers[1];
        for (int i=0; i<numbers.length-1;i++) {
            int first=numbers[i];
            for(int secondIndex =first+1; secondIndex<numbers.length;secondIndex++) {
                int second=numbers[secondIndex];
                int diff =Math.abs(first-second);
                if (diff>minDiff) {
                    minDiff=diff;
                }
            }
        }System.out.println(minDiff);
    }
}
