class Product {
    int id;
    String name;
    float price;
    float discount;

    Product() {
        System.out.println("default");
    }

    Product(float price, float discount) {
        this();
        System.out.println("Parameterised 1");

        this.price = price;
        this.discount = discount;
    }

    Product(int id, String name, float price, float discount) {
        this(price, discount);
        System.out.println("Parameterised 2");
        this.id = id;
        this.name = name;
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Product obj = new Product(1, "Siya", 100, 5);
    }

}