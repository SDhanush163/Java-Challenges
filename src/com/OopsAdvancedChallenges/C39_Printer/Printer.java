package com.OopsAdvancedChallenges.C39_Printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel < 0 || tonerLevel > 100 ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100 || tonerLevel + tonerAmount > 100)
            return -1;
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex) System.out.println("Printing in duplex mode");
        int pagesToPrint = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
