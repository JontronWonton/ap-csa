// Jonathan Klein
// 10/28/19
// array1.java

public class array1 {
    public static void main(String[] args) {
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
