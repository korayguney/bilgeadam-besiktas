package com.bilgeadam.o2ocp.antipattern;

import com.bilgeadam.o1sp.pitfall.Invoice;

public interface InvoicePersistence {
    void save(Invoice invoice);
}
