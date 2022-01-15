package CoreJavaPractice;

public class FindDiscount {

    public static double discount(int price, int percentage) {
        double price_after_discount = 0;

        price_after_discount = price - (price* percentage/100);
        return price_after_discount;
    }

    public static void main(String[] args) {
        int price = 1500;
        int percentage = 20;

        System.out.println(discount(price,percentage));
    }
}
