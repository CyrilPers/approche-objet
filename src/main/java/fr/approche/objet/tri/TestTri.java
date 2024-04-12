package fr.approche.objet.tri;

import fr.approche.objet.fichier.Ville;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestTri {
    public static void main(String[] args) throws IOException {
        ArrayList<Ville> villes = new ArrayList<>();
        Path pathOrigine = Paths.get("C:/Users/777/Downloads/recensement.csv");
        boolean exists = Files.exists(pathOrigine);
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);

        if (exists) {
            for (int i = 1; i < lines.size(); i++) {
                String[] tokens = lines.get(i).split(";");
                int population = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));
                fr.approche.objet.fichier.Ville newVille = new Ville(tokens[6], tokens[2], tokens[1], population);
                villes.add(newVille);
            }
        }

        ArrayList<Ville> villes25k = villes.stream().filter(v -> v.getPopulationTotale() > 25000).collect(Collectors.toCollection(ArrayList::new));

        Collections.sort(villes25k);
        for (Ville ville: villes25k) {
            System.out.println(ville.getPopulationTotale());
        }
    }
}
