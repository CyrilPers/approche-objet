package fr.approche.objet;

import java.sql.SQLOutput;

public class chaines {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append("i");
        }

        builder.toString();
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        long debut1 = System.currentTimeMillis();
        String chain = "";
        for (int i = 0; i < 100000; i++) {
            chain = chain + i;
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes 2 :" + (fin1 - debut1));
    }
}
