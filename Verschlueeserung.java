public class Verschlueeserung {
    protected String verschl;
    protected String entschl;
    public void honk() {
        System.out.println("Tuut, tuut!");
    }


    public Verschlueeserung(String vs, String es) {
        verschl = vs;
        entschl = es;
    }

}


class Caesar extends Verschlueeserung {
    private String offset;

    public Caesar(String vs, String es, String o) {
        super(vs, es);
        offset = o;

    }
    public void jonk(){
        System.out.println(" varrrAUU");

    }



    class Morse extends Verschlueeserung {
        private String schlusselTabelle;

        public Morse(String vs, String es, String st) {
            super(vs, es);
            schlusselTabelle=st;


        }
    }

    public static void main(String[] args) {
        Verschlueeserung v1=new Verschlueeserung(" en","ent");
        Caesar c1=new Caesar("en","ec", "rh" );
        v1.honk();
        c1.jonk();

    }
}

