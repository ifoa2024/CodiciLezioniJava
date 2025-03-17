import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creazione di un oggetto Scanner
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine(); // Leggi una linea di testo
        System.out.println("Hai inserito: " + input);
        scanner.close(); // Chiudi lo scanner per rilasciare le risorse
    }
}
