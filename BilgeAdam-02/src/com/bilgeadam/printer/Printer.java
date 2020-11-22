package com.bilgeadam.printer;

public class Printer {
    // variables
    private int tonerLevel;
    private int pagesPrintedNumber;
    private boolean isDublex;

    // constructors

    public Printer(int tonerLevel, boolean isDublex) {
        this.tonerLevel = tonerLevel;
        this.isDublex = isDublex;
        this.pagesPrintedNumber = 0;
    }

    public Printer(boolean isDublex) {
        this.isDublex = isDublex;
        this.pagesPrintedNumber = 0;
    }

    // custom methods
    public int fillUpToner(int addedTonerAmount){
        if(this.tonerLevel > -1 && this.tonerLevel < 100){
            if(this.tonerLevel + addedTonerAmount < 100){
                this.tonerLevel += addedTonerAmount;
            }
        } else {
            System.out.println("Wrong Input");
        }
        return this.tonerLevel;
    }

    public int calcPrintedPage(int pagesPrinted){
        if(isDublex){
            this.pagesPrintedNumber += pagesPrinted/2 + pagesPrinted%2;
            this.tonerLevel -= pagesPrinted * 2;
        } else{
            this.pagesPrintedNumber += pagesPrinted;
            this.tonerLevel -= pagesPrinted;
        }
        return this.pagesPrintedNumber;
    }

    // getter & setter
    public int getTonerLevel() {
        if(tonerLevel > 0)
            return tonerLevel;
        else
            System.out.println("Toner is over");
            return 0;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrintedNumber() {
        return pagesPrintedNumber;
    }

    public void setPagesPrintedNumber(int pagesPrintedNumber) {
        this.pagesPrintedNumber = pagesPrintedNumber;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    // Objects methods [toString, clone, hashCode, equals]


}
