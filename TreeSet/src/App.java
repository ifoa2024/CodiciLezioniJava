import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public record Point3D(int x, int y, int z){}
    public static void main(String[] args) throws Exception {
        // Set<Integer> numbers = new TreeSet<Integer>(
        //     Set.of(1,5,3,4,9)
        // );

        // System.out.println(numbers);

        // Set<String> numbers = new TreeSet<>(
        //     Set.of("luigi","davide","andrea","barbara","michele")
        // );

        // System.out.println(numbers);

        class Pointer3DComparator implements Comparator<Point3D>{

            @Override
            public int compare(App.Point3D p1, App.Point3D p2) {
                return (p1.x + p1.y + p1.z) - (p2.x + p2.y + p2.z);
            }
            
        }

        Set<Point3D> points = new TreeSet<>(new Pointer3DComparator());

        points.add(new Point3D(2, 5, 3));
        points.add(new Point3D(1, 2, 6));
        points.add(new Point3D(5, 3, 4));

        System.out.println(points);
    }
}
