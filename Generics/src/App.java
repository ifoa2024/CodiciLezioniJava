public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        GenericClass<String> generico = new GenericClass<String>("Mooolto più generico");
        System.out.println(generico.getData());

        GenericClass<Integer> generico2 = new GenericClass<Integer>(10);
        System.out.println(generico2.getData());

        GenClass gen = new GenClass();
        gen.<String, Integer, Float>print("ciao", 5, 3.4f);
    }
}
