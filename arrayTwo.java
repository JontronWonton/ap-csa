// Jonathan Klein
// 11/1/19
// arrayTwo.java

public class arrayTwo {
    public static void main(String[] args) {
        // PART 1
        String[] strArray = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink", "Brown", "Gray", "Joe"};
        String[] strArray2 = {"Kenneth", "Murph", "Jason", "Arielle", "Brianna", "Nicko", "Joe", "Chase", "David", "Luke"};

        int found = 0;
        for (String i: strArray) {
            if(i.equals("Kenneth")) {
                found++;
            }
        }
        if(found > 0){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        for (String i: strArray2) {
            if (i.equals("Nicko")) {
                found++;
            }
        }
        if(found > 0){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray2.length; j++) {
                if(strArray[i].equals(strArray2[j])){
                    System.out.println("Common Elements!");
                    System.out.println("array 1 index: " + i + "\narray 2 index: " + j);
                }
            }
        }

        String temp = strArray[5];
        strArray[5] = null;
        strArray[5] = temp;

        String[] tempArray = new String[10];
        int index = tempArray.length;
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[index-1] = strArray[i];
            index--;
        }
        for (int i = 0; i < tempArray.length; i++) {
            strArray[i] = tempArray[i];
        }
        System.out.println(arrayPrint(strArray));

        String[] dupStrArray2 = new String[10];
        for (int i = 0; i < dupStrArray2.length; i++) {
            dupStrArray2[i] = tempArray[i];
        }

        System.out.println("===================================================");

        // PART 2
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] intArray2 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        int iTarget = 7;
        found = 0;
        for (int i: intArray) {
            if(i == iTarget) {
                found++;
            }
        }
        if(found > 0){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        found = 0;
        for (int i: intArray2) {
            if(i == iTarget) {
                found++;
            }
        }
        if(found > 0){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        System.out.println();

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray2.length; j++) {
                if(intArray[i]==intArray2[j]){
                    System.out.println("Common Elements!");
                    System.out.println("array 1 index: " + i + "\narray 2 index: " + j);
                }
            }
        }

        System.out.println();

        int[] tempIntArray = new int[10];
        int intIndex = tempIntArray.length;
        for (int i = 0; i < tempIntArray.length; i++) {
            tempIntArray[intIndex-1] = intArray[i];
            intIndex--;
        }
        for (int i = 0; i < tempIntArray.length; i++) {
            intArray[i] = tempIntArray[i];
        }
        System.out.println(arrayPrint(intArray));

        intIndex = tempIntArray.length;
        for (int i = 0; i < tempIntArray.length; i++) {
            tempIntArray[intIndex-1] = intArray2[i];
            intIndex--;
        }
        for (int i = 0; i < tempIntArray.length; i++) {
            intArray2[i] = tempIntArray[i];
        }
        System.out.println(arrayPrint(intArray2));
        System.out.println();

        int[] dupIntArray2 = new int[10];
        for (int i = 0; i < dupIntArray2.length; i++) {
            dupIntArray2[i] = intArray[i];
        }
        System.out.println(arrayPrint(dupIntArray2));
        System.out.println();

        int smallest = intArray2[0];
        int smallestIndex = 0;
        for (int i = 0; i < intArray2.length; i++) {
            if(intArray2[i] < smallest){
                smallest = intArray2[i];
                smallestIndex = i;
            }
        }
        System.out.println("Smallest: " + smallest + "\nindex: " + smallestIndex);
        System.out.println();

        smallest = intArray2[0];
        int secondSmallest = intArray2[1];
        int secondSmallestIndex = 1;
        for (int i = 0; i < intArray2.length; i++) {
            if(intArray2[i] < smallest){
                smallest = intArray2[i];
            }
        }
        for (int i = 0; i < intArray2.length; i++) {
            if(intArray2[i] != smallest && intArray2[i] < secondSmallest){
                secondSmallest = intArray2[i];
                secondSmallestIndex = i;
            }
        }
        System.out.println("Second smallest: " + secondSmallest + "\nIndex: " + secondSmallestIndex);


    }

    private static String arrayPrint(int[] array){
        String arrayString = "";
        for (int i : array){
            arrayString = arrayString.concat(Integer.toString(i));
            arrayString = arrayString.concat(" ");
        }
        return arrayString;
    }

    private static String arrayPrint(String[] array){
        String arrayString = "";
        for (String i : array){
            arrayString = arrayString.concat(i);
            arrayString = arrayString.concat(" ");
        }
        return arrayString;
    }

}
