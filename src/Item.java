public class Item {

 private int itemId;
 private String itemName;
 private double factoryPrice ;
 private double shopPrice ;
 private int itemQuantity;


    public Item(int itemId, String itemName, double factoryPrice, double shopPrice,int itemQuantity){


        this.itemId = itemId;
        this.itemName = itemName;
        this.factoryPrice = factoryPrice;
        this.shopPrice = shopPrice;
        this.itemQuantity = itemQuantity;

    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getFactoryPrice() {
        return factoryPrice;
    }

    public void setFactoryPrice(double factoryPrice) {
        this.factoryPrice = factoryPrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
