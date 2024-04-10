package fr.approche.objet.entites2;

import fr.approche.objet.entites.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adressePostale;
    public Personne (String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }
}
