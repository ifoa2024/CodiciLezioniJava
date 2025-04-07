import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Apple> apples = List.of(
            new Apple(Color.GREEN, 120),
            new Apple(Color.RED, 170),
            new Apple(Color.GREEN, 150),
            new Apple(Color.RED, 110),
            new Apple(Color.GREEN, 89),
            new Apple(Color.RED, 75),
            new Apple(Color.GREEN, 180)
        );

        // List<Apple> greenApples = filterApples(apples, Color.GREEN);
        // for (Apple apple : greenApples) {
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> redApples = filterApples(apples, Color.RED);
        // for (Apple apple : redApples) {
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> applesByWeight = filterApplesByWeight(apples, 150);
        // for (Apple apple : applesByWeight) {
        //     System.out.println(apple.getWeight());
        // }

        // List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        // List<Apple> redApples = filterApples(apples, new AppleRedColorPredicate());
        // List<Apple> lightApples = filterApples(apples, new AppleLightPredicate());
        // List<Apple> heavyApples = filterApples(apples, new AppleWeightPredicate());

        // for (Apple apple : heavyApples) {
        //     System.out.println(apple.getWeight());
        // }

        // ApplePredicateInterface greenApple = (Apple apple) -> apple.getColor().equals(Color.GREEN);
        // ApplePredicateInterface redApple = (Apple apple) -> apple.getColor().equals(Color.RED);
        // ApplePredicateInterface lightApple = (Apple apple) -> apple.getWeight() <= 150;
        // ApplePredicateInterface heavyApple = (Apple apple) -> apple.getWeight() > 150;

        // List<Apple> greenApples = filterApples(apples, greenApple);
        // List<Apple> redApples = filterApples(apples, redApple);
        // List<Apple> lightApples = filterApples(apples, lightApple );
        // List<Apple> heavyApples = filterApples(apples, heavyApple);


        List<Apple> greenApples = filterApples(apples, (Apple apple) -> apple.getColor().equals(Color.GREEN));
        List<Apple> redApples = filterApples(apples, (Apple apple) -> apple.getColor().equals(Color.RED));
        List<Apple> lightApples = filterApples(apples, (Apple apple) -> apple.getWeight() <= 150 );
        List<Apple> heavyApples = filterApples(apples, (Apple apple) -> apple.getWeight() > 150);

        for (Apple apple : greenApples) {
            System.out.println(apple.getColor());
        }

        for (Apple apple : redApples) {
            System.out.println(apple.getColor());
        }

        for (Apple apple : lightApples) {
            System.out.println(apple.getWeight());
        }

        for (Apple apple : heavyApples) {
            System.out.println(apple.getWeight());
        }
    }


    // public static List<Apple> filterGreenApples(List<Apple> apples) {
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(Color.GREEN)){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterRedApples(List<Apple> apples) {
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(Color.RED)){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterApples(List<Apple> apples, Color color) {
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(color)){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterApplesByWeight(List<Apple> apples, int weight) {
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){ 
    //         if(apple.getWeight() > weight){
    //             result.add(apple);
    //         }
    //     }
    //     return result;
    // }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : apples){ 
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
