import java.util.Scanner;

public class Rounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the first side of the triangle
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = scanner.nextDouble();

        // Prompt the user to enter the length of the second side of the triangle
        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = scanner.nextDouble();

        // Prompt the user to enter the length of the third side of the triangle
        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Set the distance to run in meters (5 km = 5000 meters)
        double distanceToRun = 5000; // 5 km in meters

        // Calculate the number of rounds the athlete needs to run
        double rounds = distanceToRun / perimeter;

        // Print the total number of rounds the athlete will run to complete 5 km
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\n", rounds);

        scanner.close();
    }
}