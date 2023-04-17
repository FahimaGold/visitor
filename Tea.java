public class Tea {

    // Complete this code
    private String brand;
    private double price;
    private double tax;
    private boolean discount;

    public Tea(String brand, double price, double tax, boolean discount) {
        this.brand = brand;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
    }


    public String getBrand() {
        return brand;
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
