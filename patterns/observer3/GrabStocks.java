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
    }
}
