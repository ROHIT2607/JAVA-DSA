package OOP.packages.a;

import static OOP.packages.b.Greetings.showB;;

public class Greetings {
    public static void showA() {
        System.out.println("A");
    }

    public static void main(String args[]) {
        System.out.println("Hello this is from package A");
        showB();

        Message m1 = new Message(10);
        System.out.println(m1.age);
    }
}
