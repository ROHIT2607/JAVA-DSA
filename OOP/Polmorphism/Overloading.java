package OOP.Polmorphism;

public class Overloading {

    public static void sum(int a, int b) {
        System.out.println((a + b));
    }

    public static void sum(int a, float b) {
        System.out.println((a + b));
    }

    public static void main(String args[]) {
        sum(10, 20);
        sum(10, 20.7F);

    }
}
