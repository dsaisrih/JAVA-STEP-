import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5.0/9.0;

        System.out.printf("The %.2f Fahrenheit is %.2f Celsius\n", fahrenheit, celsiusResult);

        scanner.close();
    }
}