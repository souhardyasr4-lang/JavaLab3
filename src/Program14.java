import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor called");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

// Derived class
class Box2 extends Plate {
    double height;

    Box2(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box constructor called");
        System.out.println("Height = " + height);
    }
}

// Derived class
class WoodBox extends Box2 {
    double thickness;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thickness = t;
        System.out.println("WoodBox constructor called");
        System.out.println("Thickness = " + thickness);
    }
}

// Main class (FILE NAME MUST MATCH THIS)
public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, width, height and thickness:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        new WoodBox(l, w, h, t);

        sc.close();
    }
}
