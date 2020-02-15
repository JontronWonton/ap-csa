// Jonathan Klein
// 11/21/19
// arrayProj.java

import java.util.Scanner;

public class arrayProj {
    public static void main(String[] args) {

        // initial declaration of 3 phrases as strings & conversion to arrays:

        String phrase1 = "force is mass times acceleration";
        String[] phrase1Array = stringToArray(phrase1);

        String phrase2 = "as speed increases time slows down";
        String[] phrase2Array = stringToArray(phrase2);

        String phrase3 = "velocity is a vector";
        String[] phrase3Array = stringToArray(phrase3);

        // initialization of database of all phrases in a 2D array
        String[][] phraseDatabase = {phrase1Array, phrase2Array, phrase3Array};
        // initialization of variable to keep track of which round is going on
        int round = 1;
        // initialization of variable to keep track of which phrase is being worked on
        String[] currentPhrase;

        // initialization of reference array of the alphabet to compare determine the validity of user input
        String[] alphabetRef = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        // initialization of reference array of length 26 for each guess that the user inputs (unless guess is already in the array)
        String[] guesses = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

        // initialization of scanner object for user input
        Scanner in = new Scanner(System.in);

        // initialization of boolean to check if user's input is correct
        boolean correct;
        // initialization of variable to keep track of user's score
        int userScore = 0;
        // initialization of variable to store the score spun randomly
        int spinValue;
        // initialization of variable to store the user's input
        String userInput;

        // welcome message
        System.out.println("Welcome to Wheel of Fortune: Physics theme!");
        // main program body: runs until all rounds have been completed
        while (round <= 3){
            // sets current phrase by referencing 2D array which contains all phrase arrays (Uses round as reference for index)
            currentPhrase = phraseDatabase[round-1];
            System.out.println("Do you want to spin(1), solve(2) or quit(Q)?");
            // capture of user's input
            userInput = in.nextLine().toLowerCase();
            // switch statement for different cases of user input
            switch (userInput) {
                // if user inputs q to quit
                case "q":
                    // round set to 4 to break the while loop and finish program
                    round = 4;
                    // break out of case
                    break;
                // if user inputs 1 to spin
                case "1":
                    // random selection of spin value (100 to 1000 inclusive, multiples of 100)
                    spinValue = ((int) ((Math.random()*10)+1))*100;
                    System.out.println("You spun: " + spinValue + " points\nPlease guess a letter.");
                    // capture of user's input; made uniform to all other strings in project by being made lowercase
                    userInput = in.nextLine().toLowerCase();
                    // reset of correct variable to false after each guess; set to true later only if guess is correct
                    correct = false;
                    // addition of user input to guesses array; inserts the user's input into the array in the first empty space found as long as user's input isn't already in the array
                    // first checks if user entered a letter; not considered further unless this condition is true
                    if (arrayContains(alphabetRef, userInput)){
                        // iteration of guesses array
                        for (int i = 0; i < guesses.length; i++) {
                            // if empty slot found
                            if (guesses[i].equals("")) {
                                // simultaneously checks if user's guess is correct
                                if (arrayContains(currentPhrase, userInput)){
                                    correct = true;
                                }
                                // insertion of user's guess in that slot
                                guesses[i] = userInput;
                                // breaks out of process so that letter doesn't get inserted more than once
                                break;
                            // checks if user input is already in the array
                            } else if (guesses[i].equals(userInput)) {
                                System.out.println("You have already guessed that letter!");
                                // breaks out of process so that letter doesn't get inserted again
                                break;
                            }
                        }
                    }

                    // user feedback about whether guess is correct or not
                    if(correct){
                        userScore += spinValue;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect!");
                    }

                    // displays user's score
                    System.out.println("SCORE: " + userScore);

                    // display of current phrase (Only prints the characters that the user has already guessed)
                    System.out.println("\nPHRASE:");
                    line();
                    // iteration over current phrase
                    for (String i : currentPhrase) {
                        // first checks if space is encountered
                        if (i.equals(" ")) {
                            // simply print a space in place to deal with space
                            System.out.print(" ");
                        // checks if current character has been guessed
                        } else if (arrayContains(guesses, i)){
                            // fills in that space with the correct character, capitalized
                            System.out.print(i.toUpperCase() + " ");
                        // final case: character hasn't been guessed yet
                        } else {
                            // print an underscore in place
                            System.out.print("_ ");
                        }
                    }
                    System.out.println();
                    line();

                    // checks if user has guessed the entire phrase correctly
                    if (allCorrect(currentPhrase, guesses)){
                        // resets the guesses array
                        for (int i = 0; i < guesses.length; i++) {
                            guesses[i] = "";
                        }
                        // changes to next round
                        round++;
                        System.out.println("PHRASE COMPLETE!\nROUND: " + round);
                    }
                    // break out of case
                    break;

                // if user inputs 2 to guess entire phrase
                case "2":
                    System.out.println("What is your guess?");
                    userInput = in.nextLine();
                    // checks if user has guessed phrase correctly
                    if(compareArrays(stringToArray(userInput), currentPhrase)){
                        System.out.println("Correct!");
                        // resets the guesses array
                        for (int i = 0; i < guesses.length; i++) {
                                guesses[i] = "";
                            }
                        // proceeds to next round
                        round++;
                        // only prints this if round isn't final
                        if (round < 3){
                            System.out.println("ROUND: " + round);
                        }
                    // if guess is incorrect
                    } else {
                        System.out.println("Incorrect!\nScore Reset!");
                        // resets score to 0 (oof)
                        userScore = 0;
                    }
                    // break out of case
                    break;
            }
        }
        // goodVibes();
        System.out.println("Thanks for playing!\nFINAL SCORE: " + userScore);
    }

// print array method to test code during coding:
//    private static void printArray(String[] array){
//        for (String i : array) {
//            System.out.print(i + " ");
//        }
//    }

    // line method for readability
    private static void line(){
        System.out.println("==================================================================================================");
    }

    // method to convert strings to array
    private static String[] stringToArray(String str){
        // declares an array of same length of the string
        String[] array = new String[str.length()];
        // iterates over array and sets each index to that character in the string
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.substring(i, i + 1);
        }
        return array;
    }

    // method to see if two different arrays are the same
    private static boolean compareArrays(String[] arr1, String[] arr2){
        // temporary boolean (assumed true unless fallacy is found)
        boolean bool = true;
        // first checks if lengths are different
        if(!(arr1.length == arr2.length)){
            // immediately returns false & terminates method
            return false;
        // if lengths are the same
        } else {
            // iterates over first array and checks that element to that of the other array
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    // sets boolean to false if fallacy is found
                    bool = false;
                }
            }
            return bool;
        }
    }

    // method to check if user has guessed the phrase correctly by spinning
    private static boolean allCorrect(String[] phrase, String[] guesses){
        // temporary boolean (assumed true unless fallacy is found)
        boolean bool = true;
        // iterates over array and makes sure that every element in one array is in the other array (order doesn't matter)
        for (String i : phrase) {
            // if not found, boolean is set to false
            if (!arrayContains(guesses, i) && !i.equals(" ")){
                bool = false;
            }
        }
        return bool;
    }

    // linear search method to check if an array contains a given element
    private static boolean arrayContains(String[] array, String target){
        boolean bool = false;
        // iterates over provided array
        for (String i : array) {
            // set temporary boolean to true if that element is the given target
            if(i.equals(target)){
                bool = true;
            }
        }
        return bool;
    }
}

// wow