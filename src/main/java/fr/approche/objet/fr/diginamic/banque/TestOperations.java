package fr.approche.objet.fr.diginamic.banque;

import java.util.Date;

public class TestOperations {
    public static void main(String[] args) {
        Double montantOperation = 0.00;
        Operation[] operations = {new Credit(new Date(), 100.00), new Debit(new Date(), 200.00), new Credit(new Date(), 10000.50), new Debit(new Date(), 50.00)};
        for(Operation myOperation: operations) {
            System.out.println("Date d'opération " + myOperation.getDateOperation() + " de type " + myOperation.getType() +   " d'un montant de " + myOperation.getMontantOperation());

            if (myOperation instanceof Credit)
                montantOperation += myOperation.getMontantOperation();
            else
                montantOperation -= myOperation.getMontantOperation();
        }
        System.out.println(montantOperation);
    }
}
