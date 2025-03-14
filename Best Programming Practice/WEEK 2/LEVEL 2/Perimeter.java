import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the length of the side
        double side = perimeter / 4;

        // Output results
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        scanner.close();
    }
}