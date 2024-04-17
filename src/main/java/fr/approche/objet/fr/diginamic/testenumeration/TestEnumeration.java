package fr.approche.objet.fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Collections;

public class TestEnumeration {
    public static void main(String[] args) {

        for (Saison saison : Saison.values()) {
            System.out.println(saison.getLibelle());
        }

        System.out.println(Saison.ETE.getLibelle());
        String libelle = "Hiver";
        Saison saisonHiver = Saison.getEnumByLibelle(libelle);
        System.out.println(saisonHiver.getLibelle());

        System.out.println("_______________________________");
        ArrayList<VilleAvecContinent> villes = new ArrayList<>();
        Collections.addAll(villes,
                new VilleAvecContinent("New York", 1, Continent.AMERIQUE),
                new VilleAvecContinent("Paris", 1, Continent.EUROPE),
                new VilleAvecContinent("Pekin", 1, Continent.ASIE),
                new VilleAvecContinent("Moscou", 1, Continent.ASIE),
                new VilleAvecContinent("Berlin", 1, Continent.EUROPE),
                new VilleAvecContinent("Sydney", 1, Continent.OCEANIE),
                new VilleAvecContinent("Sao Paulo", 1, Continent.AMERIQUE),
                new VilleAvecContinent("Dakar", 1, Continent.AFRIQUE));


        villes.forEach(ville -> ville.toString());
    }
}
