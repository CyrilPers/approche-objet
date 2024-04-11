package fr.approche.objet.sets;

public class Pays {
    private String nom;
    private int nbHabitants;
    private int PIBHabitant;

    public Pays(String nom, int nbHabitants, int PIBHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.PIBHabitant = PIBHabitant;
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

    public int getPIBHabitant() {
        return PIBHabitant;
    }

    public void setPIBHabitant(int PIBHabitant) {
        this.PIBHabitant = PIBHabitant;
    }
}
