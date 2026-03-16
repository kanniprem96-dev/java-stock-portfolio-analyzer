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
    public void printInfo(){
        System.out.println(ticker + " | Shares: " + shares + " | Buy Price: $" + buyPrice + " | Current Price: $" + currentPrice);
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