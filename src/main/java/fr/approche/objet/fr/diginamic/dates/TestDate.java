package fr.approche.objet.fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(116, 4, 19, 23, 59, 30);
        System.out.println(d1);

        SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String chaine1 = formateur.format(d1);
        System.out.println(chaine1);
    }
}
