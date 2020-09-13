public class Color {
    public static void main(String[] args) {
        //revere a String
        String input="Ivana and Sascho";
        StringBuilder inputTwo =new StringBuilder();

        //1
        inputTwo.append(input);
        inputTwo.reverse();
        System.out.println(inputTwo);



        //2
        byte[] strAsByteArr=input.getBytes();
        byte[] result =new byte[strAsByteArr.length];
        for (int i=0;i<strAsByteArr.length;i++){
            result[i]=strAsByteArr[strAsByteArr.length-1-i];

        } System.out.println(new String(result));



        //3
        System.out.println(new StringBuilder(input).reverse().toString());

        //4
        char[] a = input.toCharArray();
        int n=input.length();
        for (int i = 0; i < n/2; i++) {
            char temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;

        }
        System.out.println(a);
;
    }
}

