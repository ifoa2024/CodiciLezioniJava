public class RubricaKey {
    public String cf;

    public RubricaKey(String cf) {
        this.cf = cf;
    }

    @Override
    public boolean equals(Object obj) {
        //Return as soon as possible
        if(this == obj) return true;
        
        if(obj == null || getClass() != obj.getClass()) return false;

        RubricaKey key = (RubricaKey)obj;
        return key.cf == this.cf;
    }

    @Override
    public int hashCode() {
        return this.cf.hashCode();
    }

}
