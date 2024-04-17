package fr.approche.objet.sets;

import java.util.Collections;
import java.util.HashSet;

public class Manipulation {
    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        Collections.addAll(pays,
                new Pays("USA", 333, 76333),
                new Pays("France", 68, 36800),
                new Pays("Allemagne", 83, 46000),
                new Pays("UK", 68, 42000),
                new Pays("Italie", 60, 35000),
                new Pays("Japon", 126, 40000),
                new Pays("Chine", 1400, 10000),
                new Pays("Russie", 146, 11000),
                new Pays("Inde", 1300, 2000));

        pays.stream().map(pays -> pays.getPIBHabitant()).max().ifPresent(System.out::println);
        pays.stream().map(pays -> pays.getNbHabitants()).max().ifPresent(System.out::println);
        Pays minPIBTotalPays = pays.stream().map(pays -> pays.getNbHabitants() * pays.getPIBHabitant()).min().stream().orElse(null);



    }
}
