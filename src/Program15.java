// Base class
class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

// Derived class
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

// Derived class
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

// Main class
public class Program15 {
    public static void main(String[] args) {

        Apple ref;   // base class reference

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}
