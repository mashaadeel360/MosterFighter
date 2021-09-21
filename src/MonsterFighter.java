public class MonsterFighter {
    public static void main(String[] args) throws Exception {
        Monster player = new Monster("peekandchew");
        Monster computer = new Monster("charsalad");

        int roundCounter = 0;
        while(player.isAlive() && computer.isAlive()) {
            if(roundCounter % 2 == 0) player.attack(computer);
            else computer.attack(player);
            roundCounter++;
        }
    }
}
