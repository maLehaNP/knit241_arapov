package org.knit.lab5;

import java.util.Objects;

public class ShopItem {
    private String name;
    private float price;
    private boolean havePackage;

    public ShopItem(String name) {this.name = name;}

    public String getName() {return name;}
    public float getPrice() {return price;}
    public boolean getHavePackage() {return havePackage;}

    public void setPrice(float price) {this.price = price;}
    public void setHavePackage(boolean havePackage) {this.havePackage = havePackage;}

    @Override
    public String toString() {
        return name + " price=" + price
                + " havePackage=" + havePackage
                + " @" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Рефлексивность
        if (obj == null || getClass() != obj.getClass()) return false;  // Сравнение с null и проверка типа
        ShopItem item = (ShopItem) obj;
        return name.equals(item.name) && price == item.price && havePackage == item.havePackage;  // Сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, havePackage);
    }
}
