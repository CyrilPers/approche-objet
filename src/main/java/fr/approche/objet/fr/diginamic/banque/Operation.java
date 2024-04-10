package fr.approche.objet.fr.diginamic.banque;

import java.util.Date;

public abstract class Operation {
    Date dateOperation;
    Double montantOperation;

    public Operation(Date date, Double montant) {
        this.dateOperation = date;
        this.montantOperation = montant;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(Double montantOperation) {
        this.montantOperation = montantOperation;
    }

    public String getType() {
        return (this instanceof Credit) ? "CREDIT" : "DEBIT";
    }
}
