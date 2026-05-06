interface Printer {
    void printing();
}

interface Scanner {
    void scanning();
}

interface Fax {
    void faxing();
}

class AllInOne implements Printer, Scanner, Fax {
    @Override
    public void printing() {
        System.out.println("Printing...");
    }

    @Override
    public void scanning() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxing() {
        System.out.println("Faxing...");
    }
}
