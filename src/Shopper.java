public class Shopper extends User {

    public Shopper(int id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "Shopper";
    }
}
