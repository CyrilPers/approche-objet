package fr.approche.objet.fr.diginamic.banque.entites;

public class Compte {
    int compteNumber;
    double compteSolde;

    public Compte(int compteNumber, double compteSolde) {
        this.compteNumber = compteNumber;
        this.compteSolde = compteSolde;
    }

    public int getCompteNumber() {
        return compteNumber;
    }

    public void setCompteNumber(int compteNumber) {
        this.compteNumber = compteNumber;
    }
}
