import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        CrudOrm crud = new CrudOrm();

        Product prod1 = crud.getProductByName("Product 1");

        System.out.println(prod1.name + " " + prod1.price + " " + prod1.description);
    }
}
