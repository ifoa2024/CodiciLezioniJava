public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Teacher ale = new Teacher("Ale", "Leo", 37, "Java");

        Student carmine = new Student("Carmine", "Pellegrini", 26, 9);

        ale.sayHello();
        carmine.sayHello();

    }
}
