package OOP.Interface;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(Engine.PRICE);

        c1.start();
        c1.stop();
        c1.acc();
        c1.brake();
    }
}
