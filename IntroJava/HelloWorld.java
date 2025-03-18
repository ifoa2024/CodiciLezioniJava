public class HelloWorld{
    public static void main(String[] args) {
        // System.out.println("Ciao a tutti!");

        // int[] numeri = new int[5];

        // numeri[0] = 1;
        // numeri[1] = 2;
        // numeri[2] = 3;
        // numeri[3] = 4;
        // numeri[4] = 5;

        // System.out.println(numeri);
        boolean repeat = true;
        int ripeti = 3;

        do{
            System.out.println("Faccio qualcosa"+ripeti+" ");
            if(ripeti == 3){
                repeat = false;
            }   
        }while(repeat == false);
    }
}