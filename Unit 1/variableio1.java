// Jonathan Klein
// 9/10/19
//variableio1.java

/* Create a scanner object kboard */


/* Write (two) statements that will prompt a user
to enter their first name & last name and store as variables */


/* Write (two) statements that will prompt a user to enter their age, and GPA and store as variables */

/* Write (four) messages using all of the variables created */

/* Write an if statement, with a messages providing positive feedback for a good GPA, encouragement for a low GPA, and a nice message regardless of GPA */

/* Close the scanner object */

import java.util.Scanner;

public class variableio1 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        String firstName = kboard.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = kboard.nextLine();
        System.out.println("Please enter your age.");
        int age = kboard.nextInt();
        System.out.println("Please enter your GPA.");
        double gpa = kboard.nextDouble();
        System.out.println("Your name is " + firstName + " " + lastName + ". You are " + age + " years old and your GPA is " + gpa + ".");

        if (gpa > 3) {
            System.out.println("Wow! Your GPA of " + gpa + " is very good!");
        } else {
            System.out.println("You should work on your GPA of " + gpa + ". Don't worry you'll get there.");
        }

        kboard.close();
    }
}
