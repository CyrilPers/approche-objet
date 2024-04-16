package fr.approche.objet.fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,4, 19, 23, 59, 30);
        Date date = calendar.getTime();

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String chaine = formateur.format(date);
        System.out.println(chaine);

        Locale russe = new Locale("ru", "RU");

        SimpleDateFormat formateur1 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
        String chaine1 = formateur1.format(date);
        System.out.println(chaine1);

        SimpleDateFormat formateur2 = new SimpleDateFormat("EEEE dd MMMM yyyy", russe);
        String chaine2 = formateur2.format(date);
        System.out.println(chaine2);

        SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
        String chaine3 = formateur3.format(date);
        System.out.println(chaine3);
    }
}
