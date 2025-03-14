import java.util.Scanner;

public class KmtoMl {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to hold the distance in kilometers
        double km;

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();

        // Convert kilometers to miles using the conversion factor
        double miles = km / 1.6;

        // Output the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);

        // Close the scanner
        input.close();
    }
}