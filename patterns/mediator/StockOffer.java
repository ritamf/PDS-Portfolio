public class StockOffer {
    private int stockShares = 0;

    private String stockSymbol = "";

    private int colleagueCode = 0;

    public StockOffer(int numOfShares, String stock, int colCode) {
        this.stockShares = numOfShares;
        this.stockSymbol = stock;
        this.colleagueCode=colCode;
    }

    public int getStockShares() {return this.stockShares; }
    public String getStockSymbol() {return this.stockSymbol; }
    public int getColleagueCode() {return this.colleagueCode; }
}
