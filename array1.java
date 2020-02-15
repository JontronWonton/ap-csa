// Jonathan Klein
// 10/28/19
// array1.java

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        // PART 1
        int[] numArray = {2, 3, 5, 7, 11};
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }

        System.out.println();

        for (int i : numArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < numArray.length; i++) {
            if(i%2==1){
                System.out.print(numArray[i] + " ");
            }
        }

        System.out.println();

        int[] numArray2 = new int[10];
        for(int i = 0; i < numArray2.length; i++){
            numArray2[i] = (int)(Math.random()*11);
        }
        System.out.print(arrayPrint(numArray2));

        System.out.println();

        double average = 0;
        for(int i : numArray2){
            average += i;
        }
        average /= numArray2.length;
        System.out.println("Average of arrayNum2: " + average);

        System.out.println(); // PART 2

        String[] hogwartsArray = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name.");
        String userIn = in.next();
        System.out.println(userIn + ", you have been selected to House " + hogwartsArray[(int) (Math.random()*hogwartsArray.length)]);

        System.out.println(); // PART 3

        int random;
        int randomIndex;
        int[] histogramArray = new int[5];
        for (int i = 0; i < 100; i++) {
            random = (int) (Math.random()*51);
            randomIndex = random;
            if(randomIndex == 50){
                randomIndex = 4;
            } else {
                randomIndex = (random/10);
            }
            histogramArray[randomIndex] += 1;
        }

        for (int i : histogramArray) {
            System.out.println(i);
        }

    }

    private static String arrayPrint(int[] array){
        String arrayString = "";
        for (int i : array){
            arrayString = arrayString.concat(Integer.toString(i));
            arrayString = arrayString.concat(" ");
        }
        return arrayString;
    }

}
