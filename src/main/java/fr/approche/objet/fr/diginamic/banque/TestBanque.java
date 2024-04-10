package fr.approche.objet.fr.diginamic.banque;

import fr.approche.objet.fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(123456, 9500000.77);
        System.out.println(compte);
    }
}
