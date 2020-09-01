public class Loop {
    public static void main(String[] args) {
        int x=3;
        int y=5;
        if (x<y){
            int t=x;
            x=y;
            y=t;

        }
        System.out.println("x="+x);
        System.out.println("y="+y);
        if (Math.random() < 0.5) System.out.println("Heads");
        else                     System.out.println("Tails");
    }
}


