public class AppleRedColorPredicate implements ApplePredicateInterface {
    public boolean test(Apple apple) {
        return Color.RED.equals(apple.getColor());
    }
}
