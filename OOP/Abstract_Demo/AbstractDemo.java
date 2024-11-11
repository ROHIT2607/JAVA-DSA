package OOP.Abstract_Demo;

abstract class parent {
    abstract void message();
}

class child extends parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {
        child c1 = new child();
        c1.message();
    }
}
