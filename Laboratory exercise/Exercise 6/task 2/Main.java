package task2;

public class Main {
    public static void main(String[] args) {
        StockTicker ticker = new StockTicker();

        ticker.updatePrice("AAPL", 150.0);
        ticker.updatePrice("GOOGL", 2800.5);
        ticker.updatePrice("AAPL", 155.0);
        ticker.updatePrice("MSFT", 330.2);

        ticker.getLastPrice("AAPL");
        ticker.getLastPrice("GOOGL");
        ticker.getLastPrice("MSFT");
        ticker.getLastPrice("TSLA");

        ticker.displayAllPrices();
    }
}
