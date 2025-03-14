public class FinalFee {
    public static void main(String[] args) {
        // Original fee and discount percentage
        double fee = 125000.0;
        double discountPercent = 10.0;

        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Output the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f",
                discount, finalFee);
    }
}