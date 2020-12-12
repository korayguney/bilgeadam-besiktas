package com.bilgeadam.overrideexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class TestB extends TestA{

    @Override
    public void methodA() throws FileNotFoundException {
        // implementation
    }

    @Override
    public void methodB() throws IllegalArgumentException {
        super.methodB();
    }
}
