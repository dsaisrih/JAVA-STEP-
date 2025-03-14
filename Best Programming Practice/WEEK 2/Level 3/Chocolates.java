import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output results
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d\n",
                chocolatesPerChild, remainingChocolates);

        scanner.close();
    }
}