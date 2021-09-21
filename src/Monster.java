public class Monster {
    private String name;
    private int health;
    private int strength;

    public Monster(String name) {
        this.name = name;
        this.health = 10;
        this.strength = 3;
    }

    public void takeDamage(int damage) {
        health-=damage;
    }    

    public void attack(Monster target) {
        int damage = (int) (Math.random() * strength);
        System.out.println(name + "attacks!!");
        target.takeDamage(damage);
    }

    public boolean isAlive () {
        return health > 0;
    }
        
        
}