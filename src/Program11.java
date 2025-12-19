import java.util.Scanner;

class Subtract {

    // subtract two numbers
    void sub(int a, int b) {
        System.out.println("Result (2 numbers) = " + (a - b));
    }

    // subtract three numbers
    void sub(int a, int b, int c) {
        System.out.println("Result (3 numbers) = " + (a - b - c));
    }
}

public class Program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s.sub(a, b);

        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        s.sub(x, y, z);
    }
}