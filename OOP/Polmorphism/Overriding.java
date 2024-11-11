package OOP.Polmorphism;

class A {
    void run() {
        System.out.println("Im from Class A");
    }
}

class B extends A {
    // @Override
    void run() {
        System.out.println(("Im from class B"));
    }
}

public class Overriding {
    public static void main(String args[]) {
        A b1 = new B();
        b1.run();
    }
}
