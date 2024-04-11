package fr.approche.objet.listes;

import java.util.ArrayList;
import java.util.OptionalInt;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        for (Integer number: liste) {
            System.out.println(number);
        }
        System.out.println(liste.size());

        liste.stream().mapToInt(i -> i).max().ifPresent(System.out::println);
        liste.replaceAll(number -> number < 0 ? number * -1 : number);
        liste.forEach(System.out::println);
    }
}

