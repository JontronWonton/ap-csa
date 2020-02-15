// Jonathan Klein
// 11/11/19
// array3.java

public class array3 {
    public static void main(String[] args) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] strArray = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink", "Brown", "Gray", "Joe"};

        int [] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
                48, 49, 50};

        int [] unSortedArray = {86, 57, 33, 88, 55, 20, 43, 98, 93, 28, 3,
                32, 83, 97, 81, 15, 19, 49, 9, 21, 95, 18, 73, 6, 34, 58, 66,
                13, 45, 56, 44, 62, 67, 82, 52, 59, 36, 76, 89, 11, 63, 69, 94,
                74, 23, 99, 41, 77, 7, 10, 79, 40, 90, 26, 61, 38, 75, 5, 14,
                68, 85, 16, 64, 39, 35, 53, 54, 50, 22, 51, 29, 17, 12, 25, 84,
                42, 87, 47, 2, 96, 31, 65, 71, 48, 4, 70, 24, 46, 60, 92, 72,
                80, 100, 8, 78, 37, 1, 27, 30, 91};

        // PART 1
        binarySearch(sortedArray, 26);
        binarySearch(sortedArray, 51);
        linearSearch(unSortedArray, 29);
        linearSearch(sortedArray, 52);
        System.out.println();

        // PART 2
        System.out.println(arrayPrint(sortedArray));
        System.out.println(arrayPrint(unSortedArray));
        System.out.println();

        selectSort(unSortedArray);
        insertSort(unSortedArray);

        for (int index = 1; index < strArray.length; index++) {
            String key = strArray[index];
            int position = index;
            while(position > 0 && strArray[position-1].compareTo(key) > 0){
                strArray[position] = strArray[position-1];
                position--;
            }
            strArray[position] = key;
        }

        System.out.println(arrayPrint(strArray));

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
            if(i != null){
                arrayString = arrayString.concat(i);
            } else {
                arrayString = arrayString.concat("null");
            }
            arrayString = arrayString.concat(" ");
        }
        return arrayString;
    }

    private static void binarySearch(int[] array, int target){
        int foundIndex = -1;
        int low = 0, high = array.length-1, middle = (low+high)/2;

        while (array[middle] != target && low <= high){
            if(target < array[middle]){
                high = middle-1;
            } else {
                low = middle+1;
            }
            middle = (low+high)/2;
        }

        if(array[middle] == target){
            foundIndex = middle;
        }

        if(foundIndex >= 0){
            System.out.println("We found number " + target + " at index: " + foundIndex);
        } else {
            System.out.println("Sorry we couldn't find the number " + target);
        }
    }

    private static void linearSearch(int[] array, int target){
        int foundIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                foundIndex = i;
            }
        }
        if(foundIndex >= 0){
            System.out.println("We found number " + target + " at index: " + foundIndex);
        } else {
            System.out.println("Sorry we couldn't find the number " + target);
        }
    }

    private static void selectSort(int[] array){
        int min, temp;
        for(int index = 0; index < array.length-1; index ++){
            min = index;
            for(int scan = index + 1; scan < array.length; scan++){
                 if(array[scan] < array[min]){
                     min = scan;
                 }
            }
            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
        System.out.println(arrayPrint(array));
    }

    private static void insertSort(int[] array){
        for (int index = 1; index < array.length; index++) {
            int key = array[index];
            int position = index;
            while(position > 0 && array[position-1] > key){
                array[position] = array[position-1];
                position--;
            }
            array[position] = key;
        }
        System.out.println(arrayPrint(array));
    }

}
