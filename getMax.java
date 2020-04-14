public class getMax {
    static int getMaxForTwo(int a, int b) {
        if (a>b){
            return a;
        }return b;
    }
    static int getMaxForThree(int a, int b,int c){
        /*int d=getMaxForTwo(a,b);
        int e=getMaxForTwo(d,c);
        return e;
        */
        return getMaxForTwo(getMaxForTwo(a,b),c); //overloading
    }
    public static void main(String[] args) {
        int maxTwo=getMaxForTwo(3,-5);
        System.out.println(maxTwo);
        int maxThree=getMaxForThree(3,6,23);
        System.out.println(maxThree);
    }
}
