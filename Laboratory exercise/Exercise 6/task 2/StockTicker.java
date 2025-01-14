package task2;

import java.util.*;

public class StockTicker {

    private Map<String, Queue<Double>> stockPrices;

    public StockTicker() {
        stockPrices = new HashMap<>();
    }

    public void updatePrice(String stock, double price) {
        stockPrices.putIfAbsent(stock, new LinkedList<>());
        stockPrices.get(stock).add(price);
        System.out.println("Цената на " + stock + " беше обновена на " + price);
    }

    public Queue<Double> getLastPrice(String stock) {
        if (stockPrices.containsKey(stock)) {
            return stockPrices.get(stock);
        } else {
            System.out.println("Акцията " + stock + " не е намерена.");
            return null;
        }
    }

    public void displayAllPrices() {
        if (stockPrices.isEmpty()) {
            System.out.println("Няма налична информация за акции.");
        } else {
            System.out.println("Текущи цени на акциите:");
            for (Map.Entry<String, Queue<Double>> entry : stockPrices.entrySet()) {
                System.out.println("Акция: " + entry.getKey() + ", Цена: " + entry.getValue());
            }
        }
    }
}

