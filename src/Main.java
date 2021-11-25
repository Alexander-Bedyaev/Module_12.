public class Main {

    static int maxPrise = 1000;
    static int numberOfItems = 12;
    static int coinValue = 5;


    public static void main(String[] args) throws InterruptedException {
        int numberOfCoins = (new CoinReciever().getNumberOfCoins());
        PriceExposer pe = new PriceExposer();
        pe.fillThePrices(numberOfItems, maxPrise);
        pe.start();
        CoinsCounter cs = new CoinsCounter(coinValue, numberOfCoins);
        cs.start();
        cs.join();
    }

}