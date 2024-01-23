public class Product {
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Method overloading
    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product mobile = new Product();

        mobile.setPrice(1200.0);

        System.out.println("Price for a single mobile: $" + mobile.getPrice());

        System.out.println("Price for 2 mobile: $" + mobile.getPrice(2));
    }
}
