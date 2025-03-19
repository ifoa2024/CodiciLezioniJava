class Player implements Character {
    private int health = 100;

    @Override
    public void attack() {
        System.out.println("Player attacks with a sword!");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Player takes " + damage + " damage. Health: " + health);
    }

    @Override
    public int getHealth() {
        return health;
    }
}