public class Main {

    public static void main(String[] args) {

        Portfolio myPortfolio = new Portfolio();

        // Create some stocks
        Stock apple = new Stock("AAPL", 10, 150, 175);
        Stock tesla = new Stock("TSLA", 5, 200, 190);
        Stock nvidia = new Stock("NVDA", 3, 500, 550);

        // Add stocks to portfolio
        myPortfolio.addStock(apple);
        myPortfolio.addStock(tesla);
        myPortfolio.addStock(nvidia);

        // Print the portfolio
        myPortfolio.printPortfolio();
    }
}