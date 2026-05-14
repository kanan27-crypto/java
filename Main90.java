class RBI {
    double rateOfInterest() {
        return 5.0;
    }
}

class SBI extends RBI {
    double rateOfInterest() {
        return 7.5;
    }
}

class HDFC extends RBI {
    double rateOfInterest() {
        return 8.0;
    }
}

public class Main90 {
    public static void main(String[] args) {

        RBI b;

        b = new SBI();
        System.out.println("SBI Interest: " + b.rateOfInterest());

        b = new HDFC();
        System.out.println("HDFC Interest: " + b.rateOfInterest());
    }
}