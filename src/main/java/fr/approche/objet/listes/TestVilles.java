package fr.approche.objet.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();

        Collections.addAll(villes,
                new Ville("Nice", 343000),
                new Ville("Carcassonne", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600)
        );
        
        int maxHab = 0;
        Ville biggestCity = null;

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > maxHab) {
                maxHab = ville.getNbHabitants();
                biggestCity = ville;
            }
        }

        System.out.println("la ville la plus peuplée est " + biggestCity.getNom());

        Ville smallestCity = null;

        for (Ville ville : villes) {
            if (smallestCity == null || ville.getNbHabitants() < smallestCity.getNbHabitants()) {
                smallestCity = ville;
            }
        }
        villes.remove(smallestCity);

        villes.forEach(ville -> {
            if (ville.getNbHabitants() > 100000) ville.setNom(ville.getNom().toUpperCase());
        });

        villes.forEach( ville -> System.out.println(ville.getNom()));
    }
}
