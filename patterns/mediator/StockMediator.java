import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        this.colleagues = new ArrayList<>();
        this.stockBuyOffers = new ArrayList<>();
        this.stockSellOffers = new ArrayList<>();
    }

    @Override
    public void saleOffer(String stock, int shares, int colCode) {

        boolean stockSold = false;

        for(StockOffer offer : stockBuyOffers)
            if ( (offer.getStockSymbol() == stock) && (offer.getStockShares() == shares) ) {

                colleagueCodes++;
                stockBuyOffers.remove(offer);

                System.out.println(shares + "shares of " + stock + " sold to colleague with code " + colCode);

                stockSold = true;
                break;
            }
        
        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to inventory");

            StockOffer newStockOffer = new StockOffer(shares, stock, colCode);

            stockSellOffers.add(newStockOffer);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colCode) {
		boolean stockBought = false;
		
		for(StockOffer offer: stockSellOffers){
			
			if((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)){
				
				System.out.println(shares + " shares of " + stock + 
						" bought by colleague code " + offer.getColleagueCode());
				
				stockSellOffers.remove(offer);
				
				stockBought = true;
				
			} 
			
			if(stockBought){ break; }
			
		}
		
		if(!stockBought) {
			
			System.out.println(shares + " shares of " + stock + 
					" added to inventory");
			
			StockOffer newOffering = new StockOffer(shares, stock, colCode);
			
			stockBuyOffers.add(newOffering);
			
		}
    }

    @Override
    public void addColleague(Colleague newColleague) {
        colleagues.add(newColleague);
        colleagueCodes++;

        newColleague.setColleagueCode(colleagueCodes);
    }

    public void getstockOfferings(){
		
		System.out.println("\nStocks for Sale");
		
		for(StockOffer offer: stockSellOffers){
			
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
			
		}
		
		System.out.println("\nStock Buy Offers");
		
		for(StockOffer offer: stockBuyOffers){
			
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
			
		}
		
	}
}
