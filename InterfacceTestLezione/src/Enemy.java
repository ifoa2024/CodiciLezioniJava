class Enemy implements Character {
    private int health = 80;

    @Override
    public void attack() {
        System.out.println("Enemy attacks with dark magic!");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Enemy takes " + damage + " damage. Health: " + health);
    }

    @Override
    public int getHealth() {
        return health;
    }
}