// Jonathan Klein
// 1/8/20
// methods2java

public class methods2 {
    public static void main(String[] args) {
        String[] strArray = {"Wyoming", "New Jersey", "Alabama", "Mississippi", "Maine"};

        System.out.println(jollyLikes("doorknob"));
        System.out.println(reverseString("computer"));
        System.out.println(findTarget(strArray, "New Jersey"));

        System.out.println(tipCalc(20, 2, 10));
        System.out.println(countWords("Python is better than java"));
        nameGame("Mary");

    }

    private static boolean jollyLikes(String string){
        boolean bool = false;
        for (int i = 0; i < string.length()-2; i++) {
            if (string.substring(i, i+1).equalsIgnoreCase(string.substring(i+1, i+2))){
                bool = true;
            }
        }
        return bool;
    }

    private static String reverseString(String string){
        String newString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            newString = newString.concat(string.substring(i, i+1));
        }
        return newString;
    }

    private static boolean findTarget(String[] array, String target){
        for (String i : array) {
            if (i.equals(target)){
                return true;
            }
        }
        return false;
    }

    private static double tipCalc(double bill, int diners, double tipPercent){
        return (bill*(1+(tipPercent/100)))/diners;
    }

    private static int countWords(String phrase){
        int count = 1;
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.substring(i, i+1).equals(" ")){
                count++;
            }
        }
        return count;
    }

    private static void nameGame(String name){
        System.out.println(
                name + " " + name + ", bo-B" + name.substring(1) +
                "\nBanana-fana fo-F" + name.substring(1) +
                "\nFee-Fi-Fo-" + name + "\n" +
                name.toUpperCase() + "!");
    }



}
