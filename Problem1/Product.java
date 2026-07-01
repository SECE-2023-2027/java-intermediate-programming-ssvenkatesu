package Problem1;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void applyDiscount(double discount) {
        if (discount < 0) {
            return;
        }
        this.price -= this.price * discount / 100.0;
        if (this.price < 0) {
            this.price = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}