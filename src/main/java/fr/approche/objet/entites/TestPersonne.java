package fr.approche.objet.entites;

import fr.approche.objet.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale("15bis", "rue des champs elysées", 75005,"Paris");
        Personne personne1 = new Personne("Pierre", "Dupont", adresse1);
        AdressePostale adresse2 = new AdressePostale("34", "rue foche", 34000,"Montpellier");
        Personne personne2 = new Personne("Pierre", "Dupont", adresse2);
    }
}
