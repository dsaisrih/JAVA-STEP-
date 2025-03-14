public class CubicMiles {
    public static void main(String[] args) {
        // Constants
        double radiusKm = 6378.0; // Radius of Earth in kilometers
        double pi = Math.PI; // Value of pi

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert volume to cubic miles (1 km^3 = 0.239913 cubic miles)
        double volumeMiles3 = volumeKm3 * 0.239913;

        // Output the results
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",
                volumeKm3, volumeMiles3);
    }
}