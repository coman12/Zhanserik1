import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private int orderId;
    private Shopper shopper;
    private List<Product> products;

    public Order(int orderId, Shopper shopper) {
        this.orderId = orderId;
        this.shopper = shopper;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId +
                ", shopper=" + shopper.getName() +
                ", total=" + getTotalPrice() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}