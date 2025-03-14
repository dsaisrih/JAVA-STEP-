import java.util.Scanner;

public class FFafterDisc {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for fee and discount percentage
        double fee;
        double discountPercent;

        // Prompt the user to enter the fee
        System.out.print("Enter the student fee: ");
        fee = input.nextDouble();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Output the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n",
                discount, finalFee);

        // Close the scanner
        input.close();
    }
}