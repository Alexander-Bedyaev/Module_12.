public class Main {
    public static void main(String[] args) throws InterruptedException {
        PriceExposer pe = new PriceExposer();
        pe.fillThePrices(12,1000);
        pe.start();
        CoinsCounter cs = new CoinsCounter(5, 10);
        cs.start();
        cs.join();

    }
}
