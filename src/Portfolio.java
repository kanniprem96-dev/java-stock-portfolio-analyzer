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
    public void printPortfolio(){
        System.out.println("Your Portfolio:");
        for(Stock stock : stocks){
            stock.printInfo();
        }
        System.out.println("---------------------------");
    }
}