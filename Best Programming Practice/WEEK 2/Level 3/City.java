import java.util.Scanner;

public class   City {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter the starting city
        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();

        // Prompt the user to enter the intermediate city
        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();

        // Prompt the user to enter the destination city
        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();

        // Prompt the user to enter the distance from the starting city to the intermediate city
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        // Prompt the user to enter the distance from the intermediate city to the destination city
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Prompt the user to enter the time taken for the entire journey
        System.out.print("Enter time taken in hours: ");
        double timeTaken = scanner.nextDouble();

        // Print the travel details
        System.out.printf("Travel details for %s: From %s to %s via %s, total distance: %.2f miles, time taken: %.2f hours\n",
                name, fromCity, toCity, viaCity, fromToVia + viaToFinalCity, timeTaken);

        scanner.close();
    }
}