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

public class Main6 {
    public static void main(String[] args) {
        AllInOne allInOne = new AllInOne();
        allInOne.printing();
        allInOne.scanning();
        allInOne.faxing();
    }
}