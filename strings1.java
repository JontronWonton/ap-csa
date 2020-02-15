// Jonathan Klein
// 12/1/19
// strings1.java

public class strings1 {
    public static void main(String[] args) {

        System.out.println(endsWithAsterisk("12345*"));

        System.out.println(formatbday("08252003"));

        System.out.println(unFormatBday("08-25-2003"));

        System.out.println(ccNumber("1111222233334444"));

        System.out.println(whatIndex("Good morning Mr. Wilkins", "W"));

        System.out.println(frontToBack("Good morning"));

        System.out.println(jollyLikes("doorknob"));

        System.out.println(noDoubles("kenneth"));

        String[] strArray = {"banana", "cherry", "apple", "raspberry", "blueberry"};
        for (String i : alphabetizeIt(strArray)) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(reverseIt("computer science"));

        System.out.println(isPalindrone("Mr. Owl ate my metal worm"));

    }

    // Part 1
    private static boolean endsWithAsterisk(String string){
        if(!string.equals("")){
            return string.endsWith("*");
        } else {
            return false;
        }
    }

    private static String formatbday(String string){
        if(string.length() == 8){
            return string.substring(0, 2) + "/" + string.substring(2, 4) + "/" + string.substring(4);
        } else {
            return "ERROR: Wrong format!";
        }

    }

    private static String unFormatBday(String string){
        if(string.substring(2, 3).equals("-") && string.substring(5, 6).equals("-")){
            return string.substring(0, 2) + "/" + string.substring(3, 5) + "/" + string.substring(6);
        } else {
            return "ERROR: Wrong format!";
        }
    }

    private static String ccNumber(String string){
        return string.substring(0, 4) + " " + string.substring(4, 8) + " " + string.substring(8, 12) + " " + string.substring(12);
    }

    private static int whatIndex(String string, String target){
        return string.indexOf(target);
    }

    private static String frontToBack(String string){
        return string.substring(2) + string.substring(1);
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

    private static String noDoubles(String string){
        String newString = string;
        for (int i = 0; i < string.length()-2; i++) {
            if (string.substring(i, i+1).equalsIgnoreCase(string.substring(i+1, i+2))){
                newString = newString.substring(0, i) + "--" + newString.substring(i+2);
            }
        }
        return newString;
    }

    private static String[] alphabetizeIt(String[] strArray){
        for (int index = 1; index < strArray.length; index++) {
            String key = strArray[index];
            int position = index;
            while(position > 0 && strArray[position-1].compareTo(key) > 0){
                strArray[position] = strArray[position-1];
                position--;
            }
            strArray[position] = key;
        }
        return strArray;
    }

    private static String reverseIt(String string){
        String newString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            newString = newString.concat(string.substring(i, i+1));
        }
        return newString;
    }

    private static boolean isPalindrone(String string){
        return string.replaceAll("[!@#$%^&*()-+=;:<>?,. ]", "").equalsIgnoreCase(reverseIt(string).replaceAll("[!@#$%^&*()-+=;:<>?,. ]", ""));
    }

}
