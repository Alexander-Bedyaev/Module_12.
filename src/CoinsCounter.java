public class CoinsCounter extends Thread {
    int coinValue;
    int numberOfCoins;

    CoinsCounter(int coinValue, int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
        this.coinValue = coinValue;
    }

    public void run() {
        for(int i = 1; i <= this.numberOfCoins; ++i) {
            int inserted = this.coinValue * i;
            System.out.println("внесено: " + inserted);

            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Внесенные монеты посчитаны");
    }
}
