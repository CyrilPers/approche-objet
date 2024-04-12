package fr.approche.objet.fichier;

/**
 * Represents a city.
 */
public class Ville implements Comparable<Ville> {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    @Override
    public int compareTo(Ville autreVille) {
        if (this.populationTotale > autreVille.getPopulationTotale()) {
            return -1;
        } else if (this.populationTotale < autreVille.getPopulationTotale()) {
            return 1;
        } else
            return 0;
    }
}
