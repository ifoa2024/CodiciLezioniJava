public class Jeeg {
    public Arm armSx;
    public Arm armDx;
    public Leg legSx;
    public Leg legDx;

    private static int counter = 0;

    public Jeeg(Arm armSx, Arm armDx, Leg legSx, Leg legDx) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.legSx = legSx;
        this.legDx = legDx;
        counter++;
    }

    public void attack() {
        armSx.attack();
        armDx.attack();
    }

    public void defence(){
        legSx.defence();
        legDx.defence();
    }

    public static int getCounter() {
        return counter;
    }

}