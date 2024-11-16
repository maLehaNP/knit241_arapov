package org.knit.lab5;

import java.util.Comparator;

public class ItemHavePackageComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem o1, ShopItem o2) {
        if (o1.getHavePackage() == o2.getHavePackage()) return 0;
        else if (o1.getHavePackage()) return 1;
        else return -1;
    }
}
