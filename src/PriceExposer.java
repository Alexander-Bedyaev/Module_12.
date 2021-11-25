import java.util.Random;

public class PriceExposer extends Thread {
    private int[] priceList;


    public void fillThePrices(int numberOfItems, int maxPrice) {
        priceList = new int[numberOfItems];
        Random random = new Random();
        for (int i = 0; i < numberOfItems; i++) {
            priceList[i] = random.nextInt(maxPrice);
        }
    }

    public void run() {
        //этот поток можно зациклить, как требует того бегущая строка, обнуляя i после прохода по всему массиву.
        //но мне достаточно одной итерации
        int i = 0;
        while (i < priceList.length) {
            try {
                System.out.println("цена товара " + i + " - " + priceList[i]);
                Thread.sleep(1500);
                i++;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}