import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;
}

public class Program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        float minCgpa = 10;
        String lowName = "";

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Roll: ");
            s[i].roll = sc.nextInt();

            System.out.print("Name: ");
            s[i].name = sc.next();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextFloat();

            if (s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                lowName = s[i].name;
            }
        }

        System.out.println("Student with lowest CGPA: " + lowName);
    }
}