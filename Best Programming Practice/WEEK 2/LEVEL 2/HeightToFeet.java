import java.util.Scanner;

public class HeightToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble(); // Base is taken but not used in output
        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();

        // Convert height
        double heightInCm = height * 2.54; // Convert height to centimeters
        int heightInFeet = (int) (height / 12); // Convert height to feet
        double remainingInches = height % 12; // Remaining inches

        // Output results
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n",
                heightInCm, heightInFeet, remainingInches);

        scanner.close();
    }
}