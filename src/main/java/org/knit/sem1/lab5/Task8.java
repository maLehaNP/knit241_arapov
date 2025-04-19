package org.knit.sem1.lab5;

import java.util.*;

public class Task8 {
    public static void execute() {
        Random random = new Random();
        ItemNameComparator itemComp = new ItemNameComparator();

        String[] names = {"Книга", "Ручка", "Линейка", "Пинал", "Карандаш"};
        float[] prices = {1.2342f, 2.2341f, 3.234123f, 4.2341f};
        boolean[] packages = {true, false};
        List<ShopItem> testData = new ArrayList<ShopItem>();
        int n_samples = 100;
        HashSet<ShopItem> idenItems = new HashSet<ShopItem>();

        for (int i = 0; i < n_samples; i++) {
            ShopItem item = new ShopItem(names[random.nextInt(names.length)]);
            item.setPrice(prices[random.nextInt(prices.length)]);
            item.setHavePackage(packages[random.nextInt(2)]);
            testData.add(item);
        }
        testData.sort(itemComp);
        int idenItemCount = 0;
        int sumIdenItemCount = 0;
        for (int i = 0; i < n_samples; i++) {
            System.out.println(testData.get(i).toString());
            if (idenItems.contains(testData.get(i))) {
                continue;
            } else idenItems.add(testData.get(i));
            idenItemCount = 0;
            for (int j = i + 1; j < n_samples; j++) {
                if (testData.get(i).equals(testData.get(j))) {
                    idenItemCount++;
                }
            }
            sumIdenItemCount+=idenItemCount;
        }
        System.out.println("Количество одинаковых ShopItem: " + sumIdenItemCount);
    }
}
