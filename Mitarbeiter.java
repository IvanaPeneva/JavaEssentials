class Mitarbeiter {
   protected String name="Milo";
   protected void honk(){ //nicht private
       System.out.println("Tuuuuturbat cahk tak");
   }
}
class Abteilungsleiter extends Mitarbeiter{
    private String befoerderungsdatum="12.09";


        public static void main(String[] args) {
        Abteilungsleiter a1=new Abteilungsleiter();
        a1.honk();
        System.out.println(a1.name+ " "+ a1.befoerderungsdatum);

        }
    }
    //PRIVATE Attribute bzw. Methoden einer klassen koennen
// in Java trotz Vererbung nicht von Objekten ihrer Unterklassen
// benutzt werden. Deshalb benutzen wir PROTECTED






