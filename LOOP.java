class LOOP {
        boolean dynamoVorhanden=true;
        String farbe;
        int rahmengroesse;

       public LOOP(){
           boolean dynamoVorhanden=true;
           String farbe="blau";
           int rahmengroesse;


        }
       public LOOP(boolean d, String f, int r){
            dynamoVorhanden=d;
            farbe=f;
            rahmengroesse=r;

        }

    public static void main(String[] args) {
        LOOP f1=new LOOP();
        LOOP f2=new LOOP(false,"gelb", 29);
        System.out.println(f1.dynamoVorhanden);
        System.out.println(f2.rahmengroesse);
    }


    }



