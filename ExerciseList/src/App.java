import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        Animal dog = new Animal("Dog", "Canine", "Land");
        Animal cat = new Animal("Cat", "Feline", "Land");
        Animal cow = new Animal("Cow", "Equine", "Land");
        Animal snake = new Animal("Snake", "Reptile", "Land");
        Animal tiger = new Animal("Tiger", "Feline", "Land");
        Animal lion = new Animal("Lion", "Feline", "Land");
        Animal elephant = new Animal("Elephant", "Equine", "Land");
        Animal giraffe = new Animal("Giraffe", "Equine", "Land");
        Animal hippo = new Animal("Hippo", "Equine", "Land");
        Animal wolf = new Animal("Wolf", "Canine", "Land");
        
        List<Animal> zoo = new ArrayList<>(List.of(dog,cat,cow,snake,tiger,lion,elephant,giraffe,hippo,wolf));
        
        List<Animal> zooFilter = new ArrayList<>();
        
        //scanner restituisce una stringa type
        
        /*
        * fare una serie di controlli
        * controllo tutti i dati e li aggiungo alla nuova lista
        * 
        * ciclo tutti i dati
        * controllo del valore typology che sia uguale a quello che abbiamo inserito
        * aggiungerlo nella nuova lista
        * 
        * 
        * stampo la lista appena creata
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la tiologia: ");
        String type = scanner.nextLine();
        
        for (Animal animal : zoo) {
            if(animal.typology.equals(type)){
                zooFilter.add(animal);
            }
        }
        
        for (Animal animal : zooFilter) {
            animal.infoSpecies();
        }
        
        scanner.close();
    }
}
