package programmer_zaman_now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("MacbookPro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product.toString());
    }
}
