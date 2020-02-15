// Jonathan Klein
// 1/6/20
// methods1.java

public class methods1 {

    private static void helloWorldVoid(){
        System.out.println("Hello World");
    }

    private static void myNameVoid(){
        System.out.println("Jontron");
    }

    private static void randomNumberVoid(){
        System.out.println((int)(Math.random()*100));
    }

    private static void sayHelloVoid(String name){
        System.out.println("Hello " + name);
    }

    private static void randomNumberVoid(int limit){
        System.out.println((int)(Math.random()*limit)+1);
    }

    private static void maxNumVoid(int a, int b, int c){
        if((a > b) && (a > c)){
            System.out.println(a + " is the largest");
        } else if ((b > c) && (b > a)){
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }

    private static void printArray(String[] array){
        for (String i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void longestWord(String[] array){
        String largest = array[0];
        for (String i : array) {
            if (i.length() > largest.length()){
                largest = i;
            }
        }
        System.out.println(largest + " is the longest word");
    }

    private static void maxNumVoid(int[] array){
        int largest = array[0];
        for (int i : array) {
            if (i > largest){
                largest = i;
            }
        }
        System.out.println(largest + " is the largest number");
    }

    private static String myName(){
        return "Jontron";
    }

    private static int randomNumber(int limit){
        return (int)(Math.random()*limit);
    }

    private static int maxNum(int a, int b, int c){
        if((a > b) && (a > c)){
            return a;
        } else if ((b > c) && (b > a)){
            return b;
        } else {
            return c;
        }
    }

    private static int maxNum(int[] array){
        int largest = array[0];
        for (int i : array) {
            if (i > largest){
                largest = i;
            }
        }
        return largest;
    }

    private static String[] sortArray(String[] array){
        for (int index = 1; index < array.length; index++) {
            String key = array[index];
            int position = index;
            while(position > 0 && array[position-1].compareTo(key) > 0){
                array[position] = array[position-1];
                position--;
            }
            array[position] = key;
        }
        return array;
    }

    private static int[] sortArray(int[] array){
        for (int index = 1; index < array.length; index++) {
            int key = array[index];
            int position = index;
            while(position > 0 && array[position-1] > key){
                array[position] = array[position-1];
                position--;
            }
            array[position] = key;
        }
        return array;
    }

    public static void main(String[] args) {

        String[] strArray = {"Red", "Yellow", "Green", "Blue", "Purple"};
        int[] numArray = {11, 3, 24, 53, 34, 96, 75, 49, 88, 61};


        System.out.println("========================== Part 1 ==========================");

        helloWorldVoid();
        myNameVoid();
        randomNumberVoid();

        System.out.println("========================== Part 2 ==========================");

        sayHelloVoid("Chase");
        randomNumberVoid(10);
        maxNumVoid(5, 7, 3);
        printArray(strArray);
        longestWord(strArray);
        maxNumVoid(numArray);

        System.out.println("========================== Part 3 ==========================");

        System.out.println(myName());
        System.out.println(randomNumber(25));
        System.out.println(maxNum(9, 5, 13));
        System.out.println(maxNum(numArray));
        printArray(sortArray(strArray));
        printArray(sortArray(numArray));

    }
}
