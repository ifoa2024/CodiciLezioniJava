import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Map<RubricaKey, Person> peopleMap = new TreeMap<RubricaKey, Person>(new RubricaKeyComparator());

        Person p1 = new Person("Giuseppe", "Verdi", 40);
        RubricaKey k1 = new RubricaKey("1234567890");
        
        peopleMap.put(k1, p1);

        // Person p2 = new Person("Antonio", "Rossi", 50);
        // RubricaKey k2 = new RubricaKey("5723857293");

        Person p2 = new Person("Giuseppe", "Verdi", 40);
        RubricaKey k2 = new RubricaKey("5678901237");

        peopleMap.put(k2, p2);


        for (RubricaKey key : peopleMap.keySet()) {
            System.out.println("Nome: " + peopleMap.get(key).name + " Cognome: " + peopleMap.get(key).surname + " Age: " + peopleMap.get(key).age + " CF: " + key.cf);
        }

    }
}
