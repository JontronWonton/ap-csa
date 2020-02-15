// Jonathan Klein
// 9/20/19
// DiceGame.java

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int scoreA;
        int scoreB;

        boolean running = true;
        String keepPlaying;

        Scanner in = new Scanner(System.in);

        System.out.println("Can you beat my number?\nPress ENTER to roll your dice!");
        in.nextLine();

        while(running){
            scoreA = (int)((Math.random()*5)+1);
            scoreB = (int)((Math.random()*5)+1);

            System.out.println("Your roll: " + scoreA);
            System.out.println("Opponent's roll: " + scoreB);

            if(scoreA > scoreB){
                System.out.println("You Win!");
            } else if (scoreA < scoreB){
                System.out.println("You Lose!");
            } else {
                System.out.println("A draw!");
            }

            System.out.println("Press ENTER to try again or type Q to exit!");

            keepPlaying = in.nextLine().trim().toLowerCase();
            running = !keepPlaying.equals("q");
        }
        in.close();
    }
}