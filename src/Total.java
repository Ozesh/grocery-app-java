import java.util.Scanner;

public class Total {


    public static void main(String[] args) {
        double shopPrice;
        int discount = 5;
        double discountPrice;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list price in cents: ");
        shopPrice = sc.nextDouble();


        discountPrice = shopPrice - (shopPrice * discount) / 100;

        System.out.println("Discount Price: " + discountPrice);
    }
}

