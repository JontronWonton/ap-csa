// Jonathan Klein
// 12/13/19
// stringProj.java

public class stringProj {
    public static void main(String[] args) {

        System.out.println(formatName("O'Reilly, Bill"));

        System.out.println(reverseEach("That's gonna cost you"));

        howManyMultiples("Sally sells sea shells by the sea shore");

    }

    private static String formatName(String name){
        // Split the string into two parts and return in new order
        return name.substring(name.indexOf(",")+1).trim() + " " + name.substring(0, name.indexOf(","));
    }

    private static String reverseEach(String string){
        String revString = "";
        // Integer to keep track of where space is located
        int firstIndex = -1;
        // Initial parsing to find space
        for (int i = 0; i < string.length()-1; i++) {
            if(string.substring(i, i+1).equals(" ")){
                // Adds that portion, reversed, to the new string
                revString = revString.concat(reverseIt(string.substring(firstIndex+1, i)));
                // Adds the space for neatness
                revString = revString.concat(" ");
                // Sets the new index to where the space was located
                firstIndex = i;
            }
        }
        // Appends the last reversed portion to the string
        revString = revString.concat(reverseIt(string.substring(firstIndex+1)));
        return revString;
    }

    // Helper method from strings1 that reverses any string given
    private static String reverseIt(String string){
        String newString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            newString = newString.concat(string.substring(i, i+1));
        }
        return newString;
    }

    private static void howManyMultiples(String string){
        // Reference array of the alphabet
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        // Array to contain every instance of multiple letters
        String[] display = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        int displayIndex = 0;

        // Iteration over the alphabet
        for (String i : alphabet) {
            // Checks if that character is in the string more than twice
            if(stringContains(string, i) >= 2){
                // Appends the print statement to the display array and increases the display index
                display[displayIndex] = "Letter " + i + " appears " + stringContains(string, i) + " times\n";
                displayIndex++;
            }
        }
        // Prints the display array if it isn't empty
        if(!display[0].equals("")){
            for (String i : display) {
                System.out.print(i);
            }
        } else {
            // Error message
            System.out.println("No multiples in this string!");
        }

    }

    // Helper method that linear searches a string and returns how many times it contains a given character
    private static int stringContains(String string, String target){
        int count = 0;
        for (int i = 0; i < string.length()-1; i++) {
            if(string.substring(i, i+1).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

}
