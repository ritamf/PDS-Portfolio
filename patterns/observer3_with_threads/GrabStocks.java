public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver obs1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(190.00);
        stockGrabber.setGooglePrice(200.00);

        StockObserver obs2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(200.00);
        stockGrabber.setApplePrice(300.00);
        stockGrabber.setGooglePrice(400.00);

        stockGrabber.unregister(obs1);

        stockGrabber.setIBMPrice(900.00);
        stockGrabber.setApplePrice(900.00);
        stockGrabber.setGooglePrice(900.00);

		// Create 3 threads using the Runnable interface
		// GetTheStock implements Runnable, so it doesn't waste 
		// its one extendable class option
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "Apple", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "Google", 676.40);
		
		// Call for the code in run to execute 
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();

    }
}
