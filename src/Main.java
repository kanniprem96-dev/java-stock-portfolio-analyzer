public class Main {

    public static void main(String[] args) {

        Portfolio myPortfolio = new Portfolio();

        // Create some stocks
        Stock apple = new Stock("AAPL", 10, 150, 175);    // quantity, buyPrice, currentPrice
        Stock tesla = new Stock("TSLA", 5, 200, 190);
        Stock nvidia = new Stock("NVDA", 3, 500, 550);

        // Add stocks to portfolio
        myPortfolio.addStock(apple);
        myPortfolio.addStock(tesla);
        myPortfolio.addStock(nvidia);

        // Print individual stock details
        myPortfolio.printPortfolio();

        // Test getTotalValue
        double totalValue = myPortfolio.getTotalValue();
        System.out.printf("Total Portfolio Value: $%.2f%n", totalValue);

        // Test getTotalProfitLoss
        double totalProfitLoss = myPortfolio.getTotalProfitLoss();
        System.out.printf("Total Profit/Loss: $%.2f%n", totalProfitLoss);

        // Test Alphabetical Sort
        System.out.println("\n--- Alphabetical Order ---");
        myPortfolio.sortByTicker();
        myPortfolio.printPortfolio();

        // Test Profit Sort
        System.out.println("\n--- Sorted by Highest Profit ---");
        myPortfolio.sortByProfit();
        myPortfolio.printPortfolio();

        //Test Percentage Return Sort
        System.out.println("\n--- Sorted by Highest Percentage Return ---");
        myPortfolio.sortByPercentageReturn();
        myPortfolio.printPortfolio();

        // 3. Find and Highlight Best/Worst
        Stock best = myPortfolio.getBestPerformingStock();
        Stock worst = myPortfolio.getWorstPerformingStock();

        if (best != null && worst != null) {
            System.out.println("===============================");
            System.out.println("BEST PERFORMER: " + best.getTicker() + " (" + String.format("%.2f", best.getPercentageReturn()) + "%)");
            System.out.println("WORST PERFORMER: " + worst.getTicker() + " (" + String.format("%.2f", worst.getPercentageReturn()) + "%)");
            System.out.println("===============================");
        }
    }
}

