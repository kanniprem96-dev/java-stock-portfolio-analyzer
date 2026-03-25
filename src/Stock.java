//This represents one investment
public class Stock{
    private String ticker;          // Stock symbol, e.g., "AAPL"
    private int shares;             //Number of shares
    private double buyPrice;        //Price at purchase
    private double currentPrice;    //Current market price

    //Constructor
    public Stock(String ticker, int shares, double buyPrice, double currentPrice){
        this.ticker = ticker;
        this.shares = shares;
        this.buyPrice = buyPrice;
        this.currentPrice = currentPrice;
    }

    //Getters
    public String getTicker(){
        return ticker;
    }

    public int getShares(){
        return shares;
    }

    public double getBuyPrice(){
        return buyPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    //Method to print the basic stock info
    public void printInfo() {
        double profit = getProfitLoss();
        double percent = getPercentageReturn();

        // %-6s means "String, left-aligned, 6 spaces wide" to keep columns straight
        System.out.printf("%-6s | Shares: %-4d | Value: $%-8.2f | Profit: $%-8.2f (%-6.2f%%)%n", 
                        ticker, shares, getCurrentValue(), profit, percent);
    }

    public double getCurrentValue(){
        return shares*currentPrice;
    }

    public double getProfitLoss(){
        return (currentPrice - buyPrice)*shares;
    }

    public double getPercentageReturn(){
        return((currentPrice - buyPrice)/buyPrice)*100;
    }

}