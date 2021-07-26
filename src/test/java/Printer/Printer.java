package Printer;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.isDuplexPrinter = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel > 0) {
            System.out.println("Can print");
            this.tonerLevel = tonerLevel;
        }
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }

    public int print(int pages) {
        int pagesPrinted = pages;
        if (tonerLevel <= 0) {
            System.out.println("Toner empty, cannot print");
        }
        if (tonerLevel > 0 && pages > 0) {
            if (this.isDuplexPrinter) {
                System.out.println("Can print");
            }
            printedPages /= 2;
            this.printedPages += pagesPrinted;
        }
        return pagesPrinted;
    }

    public void addToner (int tonerAdded) {
        tonerLevel += tonerAdded;
    }
}
