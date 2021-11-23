import java.util.Random;

public class PriceExposer extends Thread {

    int[] priceList;

    public void fillThePrices(int numberOfItems, int maxPrice) {
        priceList = new int[numberOfItems];
        Random random = new Random();
        for (int i = 0; i < numberOfItems; i++) {
            priceList[i] = random.nextInt(maxPrice);
        }
    }

    public void run() {
        int i = 0;
        while (i < priceList.length) {
            try {
                System.out.println("цена товара " + i + " - " + priceList[i]);
                Thread.sleep(2000);
                i++;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Вывод цен закончен");
    }

}