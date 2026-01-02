public class Main {
  public static void main(String[] args) {

    Shop shop = new Shop();

    Product p1 = new Product(1, "Laptop", 350000);
    Product p2 = new Product(2, "Phone", 250000);
    Product p3 = new Product(3, "Headphones", 50000);

    shop.addProduct(p1);
    shop.addProduct(p2);
    shop.addProduct(p3);

    Shopper shopper = new Shopper(1, "Aruzhan");

    Order order = new Order(101, shopper);
    order.addProduct(p1);
    order.addProduct(p3);

    System.out.println(order);
    System.out.println("Search 'phone': " + shop.searchByName("phone"));
    System.out.println("Filter <=200000: " + shop.filterByPrice(200000));
    System.out.println("Sorted by price: " + shop.sortByPrice());
  }
}