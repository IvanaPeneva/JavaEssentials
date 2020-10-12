class Titel {
    private String isbn;
    private String bezeichnung;

    public Titel(String bez) {
        bezeichnung = bez;
    }
}

class Autor {
    private String name;
    private String email;

    public Autor(String n) {
        name = n;
    }
}

class AutorTitel {
    private Autor autorNeu;
    private Titel titelNeu;

    public AutorTitel(Autor aut, Titel tit) {
        autorNeu = aut;
        titelNeu = tit;
    }
}

class Ist_Autor_Von {
    private AutorTitel[] auti = new AutorTitel[100];
    public void autorTitelZuordnen() {
        auti[0] = new AutorTitel(new Autor("Goethe"), new Titel("Faust"));
        auti[1] = new AutorTitel(new Autor("Doyle"), new Titel("A Study"));
    }
}
