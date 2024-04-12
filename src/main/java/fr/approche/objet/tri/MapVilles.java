package fr.approche.objet.tri;


import fr.approche.objet.listes.Ville;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapVilles {

    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        Iterator<Map.Entry<String, Ville>> entriesIte = mapVilles.entrySet().iterator();
        String petiteVille = null;
        Integer habitants = null;
        while (entriesIte.hasNext()) {
            Map.Entry<String, Ville> entry = entriesIte.next();
            if ((habitants == null) || (habitants > entry.getValue().getNbHabitants())) {
                petiteVille = entry.getKey();
            }
        }
        mapVilles.remove(petiteVille);
        for (Ville ville : mapVilles.values()) {
            System.out.println(ville.getNom());
        }

    }
}
