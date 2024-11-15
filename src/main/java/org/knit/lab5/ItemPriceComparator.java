package org.knit.lab5;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem o1, ShopItem o2) {
        return Float.compare(o1.getPrice(), o2.getPrice());
    }
}
