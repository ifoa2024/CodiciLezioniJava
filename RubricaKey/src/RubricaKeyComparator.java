import java.util.Comparator;

public class RubricaKeyComparator implements Comparator<RubricaKey> {

    @Override
    public int compare(RubricaKey k1, RubricaKey k2) {
        return k1.cf.compareTo(k2.cf);
    }

}
