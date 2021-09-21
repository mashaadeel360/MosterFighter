import java.util.Scanner;

public class MonsterFighter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean gameEnd = false;
        do{
            Monster player = new Monster("Peekandchew(You)");
            Monster computer = new Monster("Chardsalad(Computer)");
            
            int roundCounter = 0;
            while(player.isAlive() && computer.isAlive()) {
                if(roundCounter % 2 == 0) {
                    System.out.println("\nchoose your attack: 1) thunderpunch = 75, 2) megakick = 120, 3) thunderbolt = 90, 4) risingvoltage = +10");
                    int userOption = sc.nextInt();
                    player.move(computer, userOption);
                    System.out.println("");
                    player.Display();
                    computer.Display();
                }
                else {
                    computer.computerMove(player);
                    System.out.println("");
                    player.Display();
                    computer.Display();
                }
                Thread.sleep(2000);
                roundCounter++;
            }
            if (player.isAlive()) {
                System.out.println("\nYou Kicked the computer's ass and won the game, good job");
            }
            else {
                System.out.println("\nThe computer beat your ass and won the game");
            }

            System.out.println("Do you want to play again? \n(Y or N)");
            sc.nextLine();
            String playerOption = sc.nextLine();
            if(!"Y".equals(playerOption.toUpperCase())){
                gameEnd = true;
            }
        }while(!gameEnd);
        sc.close();
    }
}