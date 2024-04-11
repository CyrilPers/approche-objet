package fr.approche.objet.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        ArrayList<Ville> villes = new ArrayList<>();
        ArrayList<String> bigVilles = new ArrayList<>();
        Path pathOrigine = Paths.get("C:/Users/777/Downloads/recensement.csv");
        Path pathDestination = Paths.get("C:/Users/777/Downloads/25000popVilles.csv");
        boolean exists = Files.exists(pathOrigine);
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);

        if (exists) {
            for (int i = 1; i < lines.size(); i++) {
                String[] tokens = lines.get(i).split(";");
                int population = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));
                Ville newVille = new Ville(tokens[6], tokens[2], tokens[1], population);
                villes.add(newVille);
            }
            String[] entetes = lines.get(0).split(";");
            String enteteLine = entetes[6] + ";" + entetes[2] + ";" + entetes[1] + ";" + entetes[9];
            bigVilles.add(enteteLine);
        }

        for (Ville ville: villes) {
            if (ville.getPopulationTotale() > 25000) {
                String line = ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale();
                bigVilles.add(line);
            }
        }
        Files.write(pathDestination, bigVilles, StandardCharsets.UTF_8);
    }
}
