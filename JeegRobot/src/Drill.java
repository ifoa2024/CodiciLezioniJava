public class Drill extends Arm {

    public Drill(Side side) {
        super(side);
    }
    
    @Override
    public void attack() {
        System.out.println("Ti attacco con il forza drill "+side+"!");
    }

}
