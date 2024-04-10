package fr.approche.objet.fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    double tauxRemuneration;
    public CompteTaux(int compteNumber, double compteSolde, double tauxRemuneration) {
        super(compteNumber, compteSolde);
        this.tauxRemuneration = tauxRemuneration;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public String toString() {
        return super.toString() + " taux de rémunération " + tauxRemuneration;
    }
}
