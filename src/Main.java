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
    }
}

//javac src/*.java
// >> java -cp src Main