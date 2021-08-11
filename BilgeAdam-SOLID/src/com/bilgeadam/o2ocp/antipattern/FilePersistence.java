package com.bilgeadam.o2ocp.antipattern;

import com.bilgeadam.o1sp.pitfall.Invoice;

public class FilePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}
