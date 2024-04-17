package fr.approche.objet.sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;

public class Manipulation {
    public static void main(String[] args) {
        HashSet<Pays> paysList = new HashSet<>();
        Collections.addAll(paysList,
                new Pays("USA", 333, 76333),
                new Pays("France", 68, 36800),
                new Pays("Allemagne", 83, 46000),
                new Pays("UK", 68, 42000),
                new Pays("Italie", 60, 35000),
                new Pays("Japon", 126, 40000),
                new Pays("Chine", 1400, 10000),
                new Pays("Russie", 146, 11000),
                new Pays("Inde", 1300, 2000));

        Optional<Pays> maxPIBHabitantPays = paysList.stream()
                .max(Comparator.comparingDouble(pays -> pays.getPIBHabitant()));
        if (maxPIBHabitantPays.isPresent()) {
            System.out.println(maxPIBHabitantPays.get().getNom());
        }

        Optional<Pays> maxPIBTotalPays = paysList.stream()
                .max(Comparator.comparingDouble(pays -> pays.getPIBHabitant()));
        if (maxPIBTotalPays.isPresent()) {
            System.out.println(maxPIBTotalPays.get().getNom());
        }

        Optional<Pays> minPIBTotalPays = paysList.stream()
                .min(Comparator.comparingDouble(pays -> (pays.getNbHabitants() * pays.getPIBHabitant())));

        if (minPIBTotalPays.isPresent()) {
            Pays minPIBToEdit = minPIBTotalPays.get();
            paysList.remove(minPIBToEdit);
            minPIBToEdit.setNom(minPIBToEdit.getNom().toUpperCase());
        }
        paysList.forEach(pays-> System.out.println(pays.getNom() + " " + pays.getNbHabitants()+ " " + (pays.getNbHabitants() * pays.getPIBHabitant())));

    }
}
