public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //Upcasting
        //Aessegno ad una variabile di tipo padre un oggetto di tipo figlio
        Arm armSx = new Fist(Side.Sx);
        Arm armDx = new Drill(Side.Dx);
        Leg legSx = new Shield();
        Leg legDx = new Shield();

        //Object composition
        Jeeg jeeg1 = new Jeeg(armSx, armDx, legSx, legDx);

        Jeeg jeeg2 = new Jeeg(new Drill(Side.Sx), new Fist(Side.Sx), new Shield(), new Shield());

        // jeeg1.attack();
        // jeeg1.defence();

        // jeeg2.attack();
        // jeeg2.defence();

        System.out.println(Jeeg.getCounter());
    }
}
