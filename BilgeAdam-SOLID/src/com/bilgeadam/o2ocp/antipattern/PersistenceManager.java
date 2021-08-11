package com.bilgeadam.o2ocp.antipattern;

public class PersistenceManager {
    InvoicePersistence invoicePersistence;
    // BookPersistence bookPersistence;

    public PersistenceManager(InvoicePersistence invoicePersistence){
                              // BookPersistence bookPersistence) {
        this.invoicePersistence = invoicePersistence;
       // this.bookPersistence = bookPersistence;
    }
}