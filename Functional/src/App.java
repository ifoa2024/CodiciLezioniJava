import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // List<Person> people = new ArrayList<>(
        //     List.of(
        //         new Person("Gianpiero", Gender.MALE),
        //         new Person("Marianna", Gender.FEMALE),
        //         new Person("Michele", Gender.MALE),
        //         new Person("Giovanna", Gender.FEMALE),
        //         new Person("Fabio", Gender.MALE)   
        //     )
        // );

        //Imperativo
        // List<Person> females = new ArrayList<>();

        // for (Person person : people) {
        //     if(Gender.FEMALE.equals(person.gender)){
        //         females.add(person);
        //     }
        // }

        // for (Person person : females) {
        //     System.out.println(person.name);
        // }

        //Dichiarativo
        //Programmazione funzionale
        // System.out.println("Prima della filter:");
        // List<Person> females = people.stream().filter(person->person.gender.equals(Gender.FEMALE)).toList();

        // for (Person person : females) {
        //     System.out.println(person.name);
        // }

        // System.out.println("Dopo la filter:");

        // for (Person person : people) {
        //     System.out.println(person.name);
        // }

        List<Integer> numbers = new ArrayList<>(
            List.of(
                2,5,6,7,8,9,12
            )
        );

        // Integer sum = numbers.stream().filter(number-> number % 2 == 0).map(number->number*number).reduce(0, Integer::sum);

        // System.out.println(sum);

        //Possiamo assegnare le lambda ad una variabile
        Predicate<Integer> check = (Integer num) -> num % 2 == 0;
        //Posso assegnare poi la variabile che contiene la lambda ad una funzione
        List<Integer> evens = numbers.stream().filter(check).collect(Collectors.toList());
        System.out.println(evens.size());

    }
}
