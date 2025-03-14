import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        // Perform integer operations considering operator precedence
        int result1 = a + (b * c); // a + (b * c)
        int result2 = (a * b) + c; // (a * b) + c
        int result3 = c + (a / b); // c + (a / b)
        int result4 = (a % b) + c; // (a % b) + c

        // Output results
        System.out.printf("The results of Int Operations are: %d, %d, %d, and %d\n",
                result1, result2, result3, result4);

        scanner.close();
    }
}