package com.bilgeadam.printer;

public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(20, true);
        String initPageNumber = String.format("Initialized printed page number is %d", printer.getPagesPrintedNumber());
        System.out.println(initPageNumber);

        printer.calcPrintedPage(21);
        System.out.println("Printed page number : " + printer.getPagesPrintedNumber());
        System.out.println("Remained tonerLevel : "+printer.getTonerLevel());


    }


}

