import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        if (rev == original)
            System.out.println(original + " is a Palindrome.");
        else
            System.out.println(original + " is NOT a Palindrome.");
    }
}
