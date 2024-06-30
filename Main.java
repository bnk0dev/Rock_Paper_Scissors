import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;
            
            while (true) {
                System.out.println("Move Rock(r) / Paper(p) / Scissors(s)");
                playerMove = scan.nextLine();
                if (playerMove.equalsIgnoreCase("r") || playerMove.equalsIgnoreCase("p") || playerMove.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }  
        
            System.out.println("Computer chose: " + computerMove);
        
            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a draw!");
            } else if (playerMove.equalsIgnoreCase("r")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You Lose!");
                }
            } else if (playerMove.equalsIgnoreCase("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equalsIgnoreCase("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You Win!");
                }
            }
            
            System.out.println("Play Again? (Y/N)");
            String playAgain = scan.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }
        scan.close();
    }
        
}