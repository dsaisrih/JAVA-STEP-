import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output results
        System.out.printf("The maximum number of possible handshakes is %d\n", maxHandshakes);

        scanner.close();
    }
}