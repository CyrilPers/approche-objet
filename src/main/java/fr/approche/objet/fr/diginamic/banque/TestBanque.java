package fr.approche.objet.fr.diginamic.banque;

import fr.approche.objet.fr.diginamic.banque.entites.Compte;
import fr.approche.objet.fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(123456, 9500000.77);
        System.out.println(compte.toString());
        CompteTaux compteTaux = new CompteTaux(1234567890, 500000.99, 5.05);
        Compte[] mesComptes = {compte, compteTaux};
        for (Compte monCompte: mesComptes) {
            System.out.println(monCompte.toString());
        }

    }
}
