public class GenClass {
    public <T,K,S> void print(T t , K k, S s) {
        System.out.println(t);
        System.out.println(k);
        System.out.println(s);
    }

    public <T,K> K print(T t) {
        return (K)t;
    }
}
