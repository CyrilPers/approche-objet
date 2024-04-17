package fr.approche.objet.fr.diginamic.testenumeration;

public enum Continent {

    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    OCEANIE("océanie");

    private String libelle;

    private Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
