public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // String name = "Giuseppe";
        // String surname = "Versi";
        // int age = 27;

        // String name1 = "Antonio";
        // String surname1 = "Rossi";
        // int age1 = 32;

        // info(name, surname, age);
        // info(name1, surname1, age1);

        Person persona1 = new Person("Giuseppe", "Verdi", 27);

        // info(persona1);

        // persona1.sayHello();

        
        Person persona2 = new Person("Giuseppe", "Verdi", 27);

        // persona2 = persona1;
        
        // System.out.println(persona1);
        // System.out.println(persona2);

        // persona1.sayHello();
        
        // persona2.name = "Luigi";

        // persona1.sayHello();

        System.out.println(persona1.equals(persona2));

    }

    // public static void info(String name, String surname, int age){
    //     System.out.println("Ciao sono "+name+" "+surname+" e ho "+age+" anni");
    // }

    // public static void info(Person persona){
    //     System.out.println("Ciao sono "+persona.name+" "+persona.surname+" e ho "+persona.age+" anni");
    // }
}