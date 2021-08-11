package com.bilgeadam.o1sp.antipattern;

import com.bilgeadam.o1sp.pitfall.Invoice;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}
