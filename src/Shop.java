import java.util.*;


public class Shop {

    static double discount;

    private static void showMenu() {
        System.out.println(" ");
        System.out.println("Menu");
        System.out.println("0. Exit" + "\n" + "1. Add item in shopping cart " + "\n" +
                "2. remove item from shopping cart " + "\n" +
                "3. Display all items " + "\n"+ "4. Enter discount % " + "\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<Item>();


        Item item;
        int itemid;
        String itemName;
        double factoryPrice;
        double shopPrice;
        int itemQuantity;
        int ch;
        int choiceId;
        int quantity = 5;



        List<Item> items = loadItemsToCart();


        while (true) {
            showMenu();
            ch = sc.nextInt();

            switch (ch) {

                case 0:
                    System.out.println(" " + "Do Not Come Back !");
                    System.exit(0);

                case 1:
                    System.out.println("Enter item ID: ");
                    itemid = sc.nextInt();
                    /*while (itemid instanceof Integer) {
                        System.out.println("That's not valid number. Enter again:");
                    }*/

                    System.out.println(itemid);

                    if (itemid >= 1 || itemid <= 333) {
                        System.out.println("Thank you! Got " + itemid);

                    } else
                        System.out.println("invalid - " + itemid);

                    System.out.println("\nEnter item name: ");
                    itemName = sc.next();


                    System.out.println("Enter factory price: ");
                    factoryPrice = sc.nextDouble();

                    if (itemid >= 1 || itemid <= 1000) {
                        System.out.println("valid " + factoryPrice);

                    } else
                        System.out.println("invalid - " + factoryPrice);


                    System.out.println("Enter shop price: ");
                    shopPrice = sc.nextDouble();

                    System.out.println("Enter quantity: ");
                    itemQuantity = sc.nextInt();

                    Iterator<Item> ls = items.iterator();
                    while (ls.hasNext()) {
                        Item test=ls.next();
                        System.out.println(test.getItemName());

                        if (test.getItemQuantity() == quantity ) {
                            System.out.println("item sold : " + test.getItemName());
                            ls.remove();
                        }
                    }

                    Item itemObj = new Item(itemid, itemName, factoryPrice, shopPrice, itemQuantity);
                    items.add(itemObj);

                    break;

                case 2:
                    System.out.println("Enter id of the item that you would like to remove: ");
                    choiceId = sc.nextInt();

                    Iterator<Item> it = items.iterator();
                    while (it.hasNext()) {
                        if (it.next().getItemId() == choiceId) {
                            System.out.println("Item to be deleted: " + it.next().getItemName());
                            it.remove();
                        }
                    }


                    break;

                case 3:

                    sortByShopPriceAscending(items);
                    printShopItems(items);
                    break;

                case 4:

                     discount=sc.nextDouble();

            }
        }


    }

    private static void printShopItems(List<Item> items) {
        System.out.println("Id" + "    " + "Name" + "    " + "FactoryPrice"  + "    " + "Quantity");
        for (Item c : items) {
            System.out.println(c.getItemId() +"    " + c.getItemName() + "    " + "   " + "   " +c.getFactoryPrice()+ "   " + "   " +" " + "  " +c.getItemQuantity() + "    ");
        }

        System.out.println("Discount given :"+ discount);

        calculateAndShowTotal(items,discount);




    }

    private static void calculateAndShowTotal(List<Item> items, double discount) {
        double total=0;

        for (Item item : items) {
            total = total + item.getShopPrice()*item.getItemQuantity();
         }

        System.out.println("TOTAL  :" + total);
         total=total-discount/100*total;

        System.out.println("GRAND TOTAL :  " + total);
    }

    private static void sortByShopPriceAscending(List<Item> items) {
        for (int k = 0; k < items.size(); k++) {
            for (int l = 0; l < items.size(); l++) {
                if (items.get(k).getFactoryPrice() < items.get(l).getFactoryPrice()) {
                    Item tmp = items.get(k);
                    items.set(k, items.get(l));
                    items.set(l, tmp);
                }
            }
        }
    }

    private static List<Item> loadItemsToCart() {
        List<Item> items = new ArrayList<Item>();

        items.add(new Item(1, "book", 6, 10, 3));
        items.add(new Item(2, "copy", 99, 30, 44));
        items.add(new Item(3, "pen", 16, 20, 55));
        items.add(new Item(4, "paper", 40, 50, 5));
        return items;
    }



    public Boolean validateItemId(int passedId) {
        return passedId >= 1 && passedId <= 333;
    }


}
