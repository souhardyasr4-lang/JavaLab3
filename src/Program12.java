// Rectangle7 class (renamed to avoid duplicate class issue)
class Rectangle7 {
    int length, breadth;

    // Default constructor
    Rectangle7() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle7(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }
}

// Driver class
public class Program12 {
    public static void main(String[] args) {

        Rectangle7 r1 = new Rectangle7();        // default constructor
        Rectangle7 r2 = new Rectangle7(5, 4);    // parameterized constructor

        System.out.println("Area (default) = " + r1.area());
        System.out.println("Area (parameterized) = " + r2.area());
    }
}
