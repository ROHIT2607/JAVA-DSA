package OOP;

import static OOP.packages.a.Greetings.showA;

public class ClassesAndObjects {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

        showA();
    }
}
