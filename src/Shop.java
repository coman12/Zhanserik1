import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> searchByName(String keyword) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Product> filterByPrice(double maxPrice) {
        return products.stream()
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Product> sortByPrice() {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }
}