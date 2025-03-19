public abstract class Arm {
    protected Side side;

    public Arm(Side side) {
        this.side = side;
    }

    public abstract void attack();
    
}
