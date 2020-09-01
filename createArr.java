public class createArr {
    public static void main(String[] args) {
        double [] b=new double[3];
        for (int i=0; i<3;i++){
            b[i]=Math.random();
            //System.out.println(b[i]);
        }
        for (int i=0;i<3;i++){
            System.out.print(b[i]);
        }
    }
}
