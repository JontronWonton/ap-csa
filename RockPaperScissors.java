// Jonathan Klein
// 9/26/19
// RockPaperScissors.java

import java.util.Scanner;
import java.util.ArrayList;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        String random;
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("rock");
        inputs.add("paper");
        inputs.add("scissors");
        String user;

        System.out.println("Welcome!\nType Q to quit!");
        while(running){
            System.out.println("Choose ROCK, PAPER or SCISSORS!\n");
            user = in.nextLine().toLowerCase().trim();
            if(user.equals("q")){
                running = false;
            } else {
                random = inputs.get((int)(Math.random()*(10/3)));
                if(inputs.contains(user)){
                    System.out.println("USER: " + user.toUpperCase() + "\nCPU: " + random.toUpperCase());
                    if(random.equals(user)){
                        System.out.println("DRAW!");
                    } else if((random.equals("rock") && user.equals("paper")) || (random.equals("scissors") && user.equals("rock")) || (random.equals("paper") && user.equals("scissors"))){
                        System.out.println("USER WINS!");
                    } else {
                        System.out.println("CPU WINS!");
                    }
                } else {
                    System.out.println("Invalid input.\n(Be sure to spell out the entire word).");
                }
            }
        }
        System.out.println("Have a good day!");
    }
}