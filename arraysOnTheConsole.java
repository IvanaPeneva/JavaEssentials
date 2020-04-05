public class arraysOnTheConsole {
    public static void main(String[] args) {
        String[] arr={"one", "two"}; //String[] arr=new String []{"one", "two"};
        for (int i=0; i<arr.length;i++) {
            System.out.printf("arr[%d]=%s%n",i,arr[i]);
            System.out.printf("arr[%d]=%s",i,arr[i]);
        }
    }
}
