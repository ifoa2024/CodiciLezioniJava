import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // Pointer3D p1 = new Pointer3D(5, 7, 3);

        // System.out.println(p1);

        Set<Pointer3D> points = Set.of(
            new Pointer3D(10, 10, 5),
            // new Pointer3D(10, 10, 5),
            new Pointer3D(20, 10, 5),
            new Pointer3D(30, 10, 5),
            new Pointer3D(40, 10, 5)
        );

        for (Pointer3D pointer3d : points) {
            System.out.println(pointer3d);
        }

        Set<Pointer3D> hashSet = new HashSet<>();

        Set<Pointer3D> treeSet = new TreeSet<>();
    }
}
