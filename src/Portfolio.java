//This stores multiple stocksand manages them
import java.util.ArrayList; //Arraylist is a dynamic array(Can grow or shrink), stores multiple objects, lets us add, remove or access items easily
                            //We don't know how many stocks the user will add
                            //ArrayList can grow dynamically as new stocks are added



public class Portfolio{
    
    private ArrayList<Stock> stocks;    //Declare a variable called stocks to store stocks
                                        //ArrayList<Stock> means this is a list that can hold Stock objects.
    public Portfolio(){
        stocks = new ArrayList<>();
    }

    //Add a stock to the portfolio
    public void addStock(Stock stock){
        stocks.add(stock);
    }

    //Print all stocks in the portfolio
    public void printPortfolio() {
        System.out.println("\n--- Current Portfolio Status ---");
        // Column Headers
        System.out.printf("%-6s | %-12s | %-15s | %-20s%n", "Ticker", "Shares", "Total Value", "Profit/Loss (%)");
        System.out.println("-----------------------------------------------------------------------");
        
        for (Stock stock : stocks) {
            stock.printInfo();
        }
        
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("Total Portfolio Value: $%.2f%n", getTotalValue());
    }

    //Sum of all stock current values
    public double getTotalValue(){
        double totalValue = 0;
        for(Stock stock : stocks){
            double value = stock.getCurrentValue();
            totalValue += value;
        }
        return totalValue;
    }

    //Sum of all profits or losses
    public double getTotalProfitLoss() {
        double totalProfitLoss = 0;

        for (Stock stock : stocks) {
            // Calculate profit/loss for this stock
            double profitLoss = (stock.getCurrentPrice() - stock.getBuyPrice()) * stock.getShares();
            totalProfitLoss += profitLoss;
        }

        return totalProfitLoss;
    }

    //Sort stocks by highest profit
    public void sortByProfit(){
        stocks.sort((s1, s2) -> Double.compare(s2.getProfitLoss(), s1.getProfitLoss()));
    }

    //Sort stocks by highest percentage return
    public void sortByPercentageReturn() {
        stocks.sort((s1, s2) -> Double.compare(s2.getPercentageReturn(), s1.getPercentageReturn()));
    }

    //Sort stocks alphabetically by ticker
    public void sortByTicker() {
        stocks.sort((s1, s2) -> s1.getTicker().compareTo(s2.getTicker()));
    }

    //Get best performing stock by percentage return
    public Stock getBestPerformingStock() {
        if (stocks.isEmpty()) {
            return null; // No stocks in portfolio
        }

        Stock bestStock = stocks.get(0);//Go to the very first slot in the stocks list and give me the object stored there
        for (Stock stock : stocks) {
            if (stock.getPercentageReturn() > bestStock.getPercentageReturn()) {
                bestStock = stock;
            }
        }
        return bestStock;
    }

    //Get worst performing stock by percentage return
    public Stock getWorstPerformingStock() {
        if (stocks.isEmpty()) {
            return null; // No stocks in portfolio
        }

        Stock worstStock = stocks.get(0);
        for (Stock stock : stocks) {
            if (stock.getPercentageReturn() < worstStock.getPercentageReturn()) {
                worstStock = stock;
            }
        }
        return worstStock;
    }
}