public class ProfitPercent {
    public static void main(String[] args) {
        // Given cost price and selling price
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Output the results using a single print statement
        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f\n" +"The Profit is INR %.2f and the Profit Percentage is %.2f%%",costPrice, sellingPrice, profit, profitPercentage);
    }
}