// Jonathan Klein
// 10/10/19
// LoopsProj.java

import java.util.Scanner; // import scanner to store in user input
import java.util.ArrayList; // import array list to hold common passwords

// class declarations
public class LoopsProj {

    // line method to neaten code
    private static void line(){
        System.out.println("\n---====================================================---\n");
    }

    // newPage method to neaten code and separate attempts
    private static void newPage(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    // main method
    public static void main(String[] args) {

        // creation of scanner object
        Scanner in = new Scanner(System.in);
        // string to store user input
        String userIn;

        // string of letters, numbers and special characters
        String chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789,.:;`~!@#$%^&*(){}[]<>'?/+=-_|";
        // index of above string, later used to append random characters to form a key
        int charsIndex;

        // creation of ArrayList object
        ArrayList<String> commonPasses = new ArrayList<>();
        // appending common passwords
        commonPasses.add("123456");
        commonPasses.add("qwerty");
        commonPasses.add("password");
        commonPasses.add("abc123");
        commonPasses.add("password1");

        // string variable to store the key
        String key;
        // length of the key, starting at 10
        int keyLength = 10;

        // integer variable to store the amount of attempts the user has tried
        int attempts = 0;

        newPage();
        // fancy line
        line();
        // welcome message
        System.out.println(" __      _____ _    ___ ___  __  __ ___ \n" +
                " \\ \\    / / __| |  / __/ _ \\|  \\/  | __|\n" +
                "  \\ \\/\\/ /| _|| |_| (_| (_) | |\\/| | _| \n" +
                "   \\_/\\_/ |___|____\\___\\___/|_|  |_|___|\n" +
                "                                        ");

        // fancy line
        line();
        // password initialization
        key = "";

        // password generator
        for(int i = 1; i <= keyLength; i++){
            // grabs random index in string of random characters
            charsIndex = (int)(Math.random()*chars.length());
            // concatenates that random character to the existing key
            key = key.concat(chars.substring(charsIndex,charsIndex+1));
        }

        // while loop boolean
        boolean cracked = false;
        while (!cracked){
            // prints amount of attempts
            System.out.println("ATTEMPTS: " + attempts);
            // instructions to user
            System.out.println("PLEASE ENTER YOUR PASSWORD:");
            // new line
            System.out.println();

            // prints password for test purposes only
            System.out.println(key);

            // stores user input into userIn variable
            userIn = in.nextLine();
            // adds one to the amount of attempts
            attempts++;

            // checks if user types 'quit', which exits the program
            if(userIn.toLowerCase().equals("quit")){
                // good vibes
                System.out.println("Have a nice day :)");
                // breaks out of loop
                break;
            }

            // new page
            newPage();
            // fancy line
            line();

            // checks if user entered the correct key
            if(userIn.equals(key)){
                System.out.println("    _   ___ ___ ___ ___ ___    ___ ___    _   _  _ _____ ___ ___  \n" +
                        "   /_\\ / __/ __| __/ __/ __|  / __| _ \\  /_\\ | \\| |_   _| __|   \\ \n" +
                        "  / _ \\ (_| (__| _|\\__ \\__ \\ | (_ |   / / _ \\| .` | | | | _|| |) |\n" +
                        " /_/ \\_\\___\\___|___|___/___/  \\___|_|_\\/_/ \\_\\_|\\_| |_| |___|___/ \n" +
                        "                                                                  ");
                // sets while loop boolean to true, breaking out of the loop
                cracked = true;
                System.out.println("WELCOME TO THE MASTER VAULT");
            // if user enters the wrong key
            } else {
                System.out.println("\n" +
                        "    _   ___ ___ ___ ___ ___   ___  ___ _  _ ___ ___ ___  \n" +
                        "   /_\\ / __/ __| __/ __/ __| |   \\| __| \\| |_ _| __|   \\ \n" +
                        "  / _ \\ (_| (__| _|\\__ \\__ \\ | |) | _|| .` || || _|| |) |\n" +
                        " /_/ \\_\\___\\___|___|___/___/ |___/|___|_|\\_|___|___|___/ \n" +
                        "                                                         \n");
            }

            // creation of new password with extended length occurs when a common password is entered, or if the user has entered too many attempts
            if((attempts >= 10 && attempts % 10 == 0) || (commonPasses.contains(userIn))){
                // adds one to keyLength
                keyLength++;
                // key reset
                key = "";
                // same password generation algorithm
                for(int i = 1; i <= keyLength; i++){
                    // random index from character string grabbed
                    charsIndex = (int)(Math.random()*chars.length());
                    // concatenation of random character to key
                    key = key.concat(chars.substring(charsIndex,charsIndex+1));
                }
            }
            // fancy line
            line();
        }
    }
}
// aight i'm bouta head out
