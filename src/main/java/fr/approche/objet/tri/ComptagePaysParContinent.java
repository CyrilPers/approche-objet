package fr.approche.objet.tri;

import fr.approche.objet.listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> listePays = new ArrayList();
        Collections.addAll(listePays,
                new Pays("France", 65, "Europe"),
                new Pays("Allemagne,", 80, "Europe"),
                new Pays("Belgique", 10, "Europe"),
                new Pays("Russie", 150, "Asie"),
                new Pays("Chine", 1400, "Asie"),
                new Pays("Indonésie", 220, "Océanie"),
                new Pays("Australie", 20, "Océanie")
        );

        HashMap<String, Integer> mapContinents = new HashMap<>();
        listePays.forEach(pays -> {
            int habitants = mapContinents.getOrDefault(pays.getContinent(), 0).intValue();
            mapContinents.put(pays.getContinent(), habitants + pays.getNbHabitants());
        });

        System.out.println(mapContinents);

    }
}
