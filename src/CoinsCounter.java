public class CoinsCounter extends Thread {
    private int coinValue;
    private int numberOfCoins;
    private int counted;

    CoinsCounter(int coinValue, int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
        this.coinValue = coinValue;
    }

    public void run() {
        for (int i = 1; i <= numberOfCoins; ++i) {
            counted = coinValue * i;
            System.out.println("внесено: " + counted);
            try {
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Использован конечный цикл, чтобы программа завершалась.
        // Хотя по логике вывод цен и внесенной суммы может продолжаться "вечно"
        for (int n = 0; n <= 12; n++) {
            try {
                System.out.println("внесено: " + counted);
                Thread.sleep(1500L);
            } catch (InterruptedException en) {
                en.printStackTrace();
            }


        }
    }
}
