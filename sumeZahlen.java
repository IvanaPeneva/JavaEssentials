public class sumeZahlen {

    public static void main(String[] args) {

        int s = 1;
        int i = 0;
        int c = 0;

        while (s < 1000) {
            i++;
            c++;

            s = i * s;

            System.out.println(s);
            System.out.println(c);

        }
        System.out.println("after "+ c +" days");
        System.out.println("He will have "+ s);
    }
}

