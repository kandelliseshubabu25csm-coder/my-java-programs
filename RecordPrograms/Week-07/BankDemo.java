
class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        // Parent class references to child class objects
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest: "
                + b.getRateOfInterest() + "%");

        b = new HDFC();
        System.out.println("HDFC Rate of Interest: "
                + b.getRateOfInterest() + "%");

        b = new ICICI();
        System.out.println("ICICI Rate of Interest: "
                + b.getRateOfInterest() + "%");
    }
}