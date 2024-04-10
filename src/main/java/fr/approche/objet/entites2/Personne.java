package fr.approche.objet.entites2;
import java.lang.*;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void printName(Personne personne) {
        System.out.println(personne.getNom().toUpperCase() + personne.getPrenom());
    }

    public void changeLastName(Personne personne, String newLastName) {
        personne.setNom(newLastName);
    }

    public void changeFirstName(Personne personne, String newFirstName) {
        personne.setPrenom(newFirstName);
    }

    public void changeAdresse(Personne personne, AdressePostale newAdresse) {
        personne.setAdressePostale(newAdresse);
    }

    public String getLastName(Personne personne) {
        return personne.getNom();
    }

    public String getFirstName(Personne personne) {
        return personne.getPrenom();
    }

}
