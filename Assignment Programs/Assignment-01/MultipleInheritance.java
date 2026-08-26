package javaproject;
interface Father {
    void house();
}

interface Mother {
    void car();
}

class Target implements Father, Mother {

    public void house() {
        System.out.println("Father has a house");
    }

    public void car() {
        System.out.println("Mother has a car");
    }
}
public class MultipleInheritance {
public class Main {
    public static void main(String[] args) {

        Target t = new Target();

        t.house();
        t.car();
    }
}
}