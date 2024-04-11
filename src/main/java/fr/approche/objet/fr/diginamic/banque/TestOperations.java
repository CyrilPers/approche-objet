package fr.approche.objet.fr.diginamic.banque;

import java.util.Date;

public class TestOperations {
    public static void main(String[] args) {
        Double montantOperation = 0.00;
        Date date = new Date();
        Operation[] operations = {new Credit(date, 100.00), new Debit(date, 200.00), new Credit(date, 10000.50), new Debit(date, 50.00)};
        for(Operation myOperation: operations) {
            System.out.println("Date d'opération " + myOperation.getDateOperation() + " de type " + myOperation.getType() +   " d'un montant de " + myOperation.getMontantOperation());

            if (myOperation instanceof Credit)
                montantOperation += myOperation.getMontantOperation();
            else
                montantOperation -= myOperation.getMontantOperation();
        }
        System.out.println("Montant final des opérations " + montantOperation);
    }
}
