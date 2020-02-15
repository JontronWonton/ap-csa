// Jonathan Klein
// 9/26/19
// RockPaperScissors.java

import java.util.Scanner;
import java.util.ArrayList;

public class RockPaperScissors {
// Class definition
    public static void main(String[] args) {
    // Main method

        Scanner in = new Scanner(System.in);
        // Scanner object to take in user input

        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("rock");
        inputs.add("paper");
        inputs.add("scissors");
        // Array list of all valid user inputs to validate user input

        String cpu;
        String user;
        // Variables to keep track of each player's input

        boolean running = true;
        // Boolean to keep the program running for desired amount of time

        System.out.println("Welcome!\nType Q to quit!");
        // Welcome message

        while(running){
        // While loop to repeat game

            System.out.println("Choose ROCK, PAPER or SCISSORS!\n");
            // Instructions to user

            user = in.nextLine().toLowerCase().trim();
            // Sets user variable to user input (set to lowercase and trimmed)

            if(user.equals("q")){
            // Checks if user wants to quit
                running = false;
                // Breaks the while loop
            } else {
                cpu = inputs.get((int)(Math.random()*(10/3)));
                // Sets the CPU choice to random element in array list, which is rock, paper, or scissors
                if(inputs.contains(user)){
                // Checks if user enters something valid
                    System.out.println("USER: " + user.toUpperCase() + "\nCPU: " + cpu.toUpperCase());
                    // Prints each player's choice
                    if(cpu.equals(user)){
                    // Draw if both choose same input
                        System.out.println("DRAW!");
                    } else if((cpu.equals("rock") && user.equals("paper")) || (cpu.equals("scissors") && user.equals("rock")) || (cpu.equals("paper") && user.equals("scissors"))){
                    // Logic for user winning
                        System.out.println("USER WINS!");
                    } else {
                    // Only other possibility is the cpu winning
                        System.out.println("CPU WINS!");
                    }
                } else {
                // If user has entered something invalid
                    System.out.println("Invalid input.\n(Be sure to spell out the entire word).");
                }
            }
        }
        System.out.println("Have a good day!");
        // End of program after loop is broken
    }
}