import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert to kilograms
        double weightInKg = weightInPounds / 2.2; // Corrected conversion factor

        // Output results
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n",
                weightInPounds, weightInKg);

        scanner.close();
    }
}