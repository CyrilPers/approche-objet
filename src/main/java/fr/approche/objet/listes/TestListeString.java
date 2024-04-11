package fr.approche.objet.listes;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        String biggestCity = "";
        int charsVille = 0;
        for (String ville: villes) {
            if (ville.length() > charsVille){
                charsVille = ville.length();
                biggestCity = ville;
            }
        }
        System.out.println(biggestCity);

        villes.stream().forEach(ville -> ville.toUpperCase());
        villes = (ArrayList<String>) villes
                .stream()
                .filter( ville -> ville.charAt(0) != 'N')
                .collect(Collectors.toList());
        villes.stream().forEach(System.out::println);
    }
}
