package fr.approche.objet.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathOrigine = Paths.get("C:/Users/777/Downloads/recensement.csv");
        boolean exists = Files.exists(pathOrigine);
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(pathOrigine, StandardCharsets.UTF_8);
        Path pathDestination = Paths.get("C:/Users/777/Downloads/100premiers.csv");
        ArrayList<String> selectedLines = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            selectedLines.add(lines.get(i));
        }
        Files.write(pathDestination, selectedLines, StandardCharsets.UTF_8);
    }
}
