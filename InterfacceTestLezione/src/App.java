public class App {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy();

        // Simulazione di un combattimento
        player.attack();
        enemy.takeDamage(20);

        enemy.attack();
        player.takeDamage(15);

        System.out.println("Player Health: " + player.getHealth());
        System.out.println("Enemy Health: " + enemy.getHealth());
    }
}
