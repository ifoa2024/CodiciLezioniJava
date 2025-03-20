import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Map<String, Person> people = new HashMap<>();

        people.put("RGSFNHJASDFKJDSGHS",new Person("Alek","Leo",25));
        people.put("SALGDTSIROFJGGISGJ",new Person("Gianpiero","Abbrescia",29));
        people.put("ZDGKJZDGLKZGLKZGLZ",new Person("Michele","Favia",23));
        people.put("DLGJDSOPVMòDSKVòDS",new Person("Fabio","Portacci",25));
        people.put("JTDKBJNKJDJBNDXBDX", new Person("Carmine","Pelleggrini",24));

        Person foundedPerson = people.get("ZDGKJZDGLKZGLKZGLZ");
        System.out.println(foundedPerson);

        boolean hasGianpiero = people.containsKey("SALGDTSIROFJGGISGJ");
        System.out.println("Contiene Giampiero Abbrescia?: "+ hasGianpiero);

        people.remove("ZDGKJZDGLKZGLKZGLZ");

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
