package fr.approche.objet.entites;

public class AdressePostale {
    public String numeroRue;
    public String libelleRue;
    public int codePostal;
    public String ville;

    public AdressePostale(String numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
