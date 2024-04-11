package fr.approche.objet.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.OptionalDouble;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> doubles = new HashSet<Double>();
        Collections.addAll(doubles,1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);

        doubles.forEach(System.out::println);
        doubles.stream().mapToDouble(i -> i).max().ifPresent(System.out::println);
        Double min = doubles.stream().mapToDouble(i -> i).min().getAsDouble();
        doubles.remove(min);
        doubles.forEach(System.out::println);



    }
}
