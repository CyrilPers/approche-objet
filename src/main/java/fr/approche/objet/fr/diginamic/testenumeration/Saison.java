package fr.approche.objet.fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS(1, "Printemps"),
    ETE(2, "Ete"),
    AUTOMNE(3, "Automne"),
    HIVER(4, "Hiver");

    private int numero;
    private String libelle;


    public static Saison getEnumByLibelle(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.getLibelle().equals(libelle))return saison;
        }
        throw new IllegalArgumentException();
    }



    private Saison( int numero, String libelle) {
        this.numero = numero;
        this.libelle = libelle;

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
