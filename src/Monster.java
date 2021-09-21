public class Monster {
    String name;
    int health = 400; 
    int strength;

    public Monster(String name) {
        this.name = name;
        this.health = 200;
        this.strength = 3;
    }

    public void takeDamage(int damage) {
        health-=damage;
    }

    public boolean isAlive () {
        return health > 0;
    }

//this game should be like pokemon. Player one choses a move, it does that move, health subtract from opponant, then opponent goes. this goes on till one wins.

//Player choses move
//move 4 heals +10 everytime it is used
//1) thunderpunch = 75, 2) megakick = 120, 3) thunderbolt = 90, 4) risingvoltage = +10 hp
public void move(Monster target, int option) {
    switch (option){
        case 1: System.out.println("You Chose thunderpunch which dealt 70 damage"); target.takeDamage(70); break;
        case 2: System.out.println("You Chose megakick which dealt 100 damage"); target.takeDamage(100); break;
        case 3: System.out.println("You Chose thunderbolt which dealt 80 damage"); target.takeDamage(80); break;
        case 4: System.out.println("You Chose risingvoltage which added 10 hp"); this.takeDamage(-10); break;
    }
    checkHealth();
}

//Computer will take damage according to the player attack and will randomly choose an attack
// 1) dragonbreath = 60, 2) dragonclaw = 80, 3) flamthrower = 90, 4)flarebits = 120, 5)firedoom = +30 hp

    public void computerMove (Monster target){
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println(randomNumber);
        switch (randomNumber){
            case 1: System.out.println("Computer Chose dragonbreath which dealt 70 damage"); target.takeDamage(70); break;
            case 2: System.out.println("Computer Chose dragonclaw which dealt 80 damage"); target.takeDamage(80); break;
            case 3: System.out.println("Computer Chose flamethrower which dealt 90 damage"); target.takeDamage(90); break;
            case 4: System.out.println("Computer Chose flarebits which dealt 130 damage"); target.takeDamage(130); break;
            case 5: System.out.println("Computer Chose firedoom which added 30 hp to itself"); this.takeDamage(-30); break;
        }
        target.checkHealth();
    }

//Player health
//player health should equal to 200 and not excede 200 especealy after healing

    public void checkHealth(){
       if (health >= 200)
           health = 200; 
    }

    public void Display(){
        System.out.println(name+" is at "+health+" hp");

    
    }
}