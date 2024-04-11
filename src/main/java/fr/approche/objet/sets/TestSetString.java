package fr.approche.objet.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> paysHashSet = new HashSet<String>();
        Collections.addAll(paysHashSet, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

        String smallestPays = null;
        for (String pays: paysHashSet) {
            if (smallestPays == null || pays.length() < smallestPays.length()) smallestPays = pays;
        }
        paysHashSet.remove(smallestPays);
        paysHashSet.forEach(System.out::println);
    }


}
