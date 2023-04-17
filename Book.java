public class Book {
    // Complete this code
    private String isbn;
    private double price;
    private double tax;
    private boolean discount;

    public Book(String isbn, double price, double tax, boolean discount) {
        this.isbn = isbn;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public boolean isDiscount() {
        return discount;
    }
}
