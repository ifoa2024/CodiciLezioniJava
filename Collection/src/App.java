import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        List<Person> people = new ArrayList<Person>();


        people.add(new Person("Alek","Leo",25));
        people.add(new Person("Gianpiero","Abbrescia",29));
        people.add(new Person("Michele","Favia",23));
        people.add(new Person("Fabio","Portacci",25));
        people.add(new Person("Carmine","Pelleggrini",24));

        // for (Person person : people) {
        //     System.out.println("Ciao sono " + person.name + " " + person.surname + "ed ho " + person.age + " anni! \n");
        // }

        // Iterator<Person> persIter = people.iterator();
        // while(persIter.hasNext()){
        //     Person nextPers = persIter.next();
        //     System.out.println("Ciao sono " + nextPers.name + " " + nextPers.surname + "ed ho " + nextPers.age + " anni! \n");
        // }

        List<Person> people2 = new LinkedList<>();
        
        people2.add(new Person("Alek","Leo",25));
        people2.addLast(new Person("Gianpiero","Abbrescia",29));
        people2.add(new Person("Michele","Favia",23));
        people2.add(new Person("Fabio","Portacci",25));
        people2.add(new Person("Carmine","Pelleggrini",24));

        people2.add(2, new Person("Vincenzo","Longo",20));
        // people2.addFirst(new Person("Marianna","Rizzi",24));
        // people2.addLast(new Person("Marianna","Rizzi",24));

        // for (Person person : people2) {
        //     System.out.println("Ciao sono " + person.name + " " + person.surname + " ed ho " + person.age + "  anni!");
        // }

        List<Person> people3 = new LinkedList<>(
            List.of(
                new Person("Alek","Leo",25),
                new Person("Gianpiero","Abbrescia",29),
                new Person("Fabio","Portacci",25)
            )
        );

        people3.addAll(
            1,
            List.of(
                new Person("Michele","Favia",23),
                new Person("Fabio","Portacci",25)
            )
        );


        for (Person person : people3) {
            System.out.println("Ciao sono " + person.name + " " + person.surname + " ed ho " + person.age + "  anni!");
        }

        people3.get(4);
    }
}
