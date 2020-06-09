public class array {
    public static void main(String[] args) {
        int[] numbers =new int[10];
        for (int i=0;i<numbers.length; i++){
            numbers[i]=i+1;
            System.out.print(numbers[i] + " " );
        }numbers[3]=20;
        numbers[5]=numbers[2]+numbers[7];
        System.out.println();
        for (int n:numbers) {
            System.out.print(n+ " ");
        }
    }
}
