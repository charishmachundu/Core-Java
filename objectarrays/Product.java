package objectarrays;
import java.util.*;
public class Product implements Comparable<Product> {
        private double weight;
        private double price;
        private int id;


        public Product(double weight, double price, int id) {
            this.weight = weight;
            this.price = price;
            this.id = id;
        }


        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }


        @Override
        public int compareTo(Product product) {
            // Compare products based on their price
            return Double.compare(this.price, product.getPrice());
        }


        public static void main(String[] args) {
            List<Product> products = new ArrayList<>();
            products.add(new Product(1.5, 25.99, 1));
            products.add(new Product(2.0, 19.99, 2));
            products.add(new Product(1.0, 34.99, 3));

            Collections.sort(products);

            System.out.println("Sorted Products based on Price:");
            for (Product product : products) {
                System.out.println("ID: " + product.getId() + ", Price: $" + product.getPrice());
            }
        }
}

