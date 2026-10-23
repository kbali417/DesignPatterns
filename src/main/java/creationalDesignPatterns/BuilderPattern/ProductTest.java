package creationalDesignPatterns.BuilderPattern;

public class ProductTest {
    public static void main(String[] args){
        //use case 1 - mandatory fields
        Product product1 = new Product.ProductBuilder("Apple Macbook Pro",1000).build();
        System.out.println(product1);
        System.out.println(product1.getCategory());
        // use case 2 - non-mandatory fields
        Product product2 = new Product.ProductBuilder("Samsung Monitor",1000)
                .setCategory("Electronics")
                .setDescription("Latest model")
                .setDiscount(10)
                .setFreeshipping(true)
                .setStock(10).build();
        System.out.println(product2);
        product2.setDiscount(5);
        System.out.println(product2.getCategory());

        //use case 3 -
        Product product3 = new Product.ProductBuilder("Tshirt - Nike",250)
                .setCategory("Fashion")
                .setFreeshipping(true)
                .setStock(10)
                .build();
        System.out.println(product3);
        product3.setDescription("Black colour M Size T shirt");
        System.out.println(product3);
    }
}
