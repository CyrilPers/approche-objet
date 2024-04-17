package fr.approche.objet.fr.diginamic.testenumeration;

public class VilleAvecContinent {
    private String nom;
    private int nbHabitants;
    private Continent continent;

    public VilleAvecContinent(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fr.approche.objet.listes.Ville)) {
            return false;
        }
        fr.approche.objet.listes.Ville ville = (fr.approche.objet.listes.Ville) obj;
        return (nom.equals(ville.getNom()) && nbHabitants == ville.getNbHabitants());
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String toString() {
        System.out.println(this.getContinent().getLibelle());
        return this.getContinent().getLibelle();
    }
}

