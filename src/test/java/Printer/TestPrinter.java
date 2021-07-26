package Printer;

public class TestPrinter {

    public static void main(String[] args) {

        Printer printer = new Printer(50, 5, false);
        System.out.println("Pages count " + printer.getPrintedPages());

        printer.addToner(50);
        int pagesPrinted = printer.print(10);

        System.out.println("Number of pages printed = " + pagesPrinted);
        System.out.println("New total print count = " + printer.getPrintedPages());
    }
}
