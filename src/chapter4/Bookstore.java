package chapter4;

public class Bookstore {

    private double totalbookprice;
    private double book;
    public static final double SHIPPING_PER_BOOK = 2;
    public static final double TAX = 1.075;

    public Bookstore(double totalbookprice, double book) {
        this.totalbookprice = totalbookprice;
        this.book = book;

    }

    private double getTax(double totalbookprice) {
        return totalbookprice * TAX;
    }

    private double getShipping(double book) {
        return book * SHIPPING_PER_BOOK;
    }

    public String getTotal() {
        double total = getTax(totalbookprice) + getShipping(book);
        return "Your total is: $" + total;
    }
}
