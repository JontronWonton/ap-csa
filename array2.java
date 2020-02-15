// Jonathan Klein
// 10/30/19
// array2.java

public class array2 {
    public static void main(String[] args) {
        // PART 1
        int[][] evenArray = new int[5][5];
        for (int i = 0; i < evenArray.length; i++) {
            for (int j = 0; j < evenArray[i].length; j++) {
                evenArray[i][j] += 2*i+2*j;
            }
        }
        printMdArray(evenArray);
        System.out.println();

        // PART 2
        int[][] multFive = new int[5][5];
        for (int i = 0; i < multFive.length; i++) {
            for (int j = 0; j < multFive[i].length; j++) {
                multFive[i][j] += 25*i+5*j;
            }
        }
        printMdArray(multFive);
        System.out.println();

        for (int i = 0; i < multFive.length; i++) {
            for (int j = 0; j < multFive[i].length; j++) {
                if(multFive[i][j]==25){
                    System.out.println("Number 25 found at: (" + i + ", " +  j + ")");
                }
            }
        }

        for (int i = 0; i < multFive.length; i++) {
            for (int j = 0; j < multFive[i].length; j++) {
                if(multFive[i][j]==20){
                    System.out.println("Number 20 found at: (" + i + ", " +  j + ")");
                }
            }
        }

        for (int i = 0; i < multFive.length; i++) {
            for (int j = 0; j < multFive[i].length; j++) {
                if(multFive[i][j]==35){
                    System.out.println("Number 35 found at: (" + i + ", " +  j + ")");
                }
            }
        }
        System.out.println();

        // PART 3
        int[][] quickArray = {{4, 6, 8, 9, 10}, {2, 3, 5, 7, 11}};
        printMdArray(quickArray);
        System.out.println();

        String[][] dashArray = new String[5][5];
        for (int i = 0; i < dashArray.length; i++) {
            for (int j = 0; j < dashArray[i].length; j++) {
                dashArray[i][j] = "-";
            }
        }
        printMdArray(dashArray);
        System.out.println();

        // PART 4
        String[][] classroom =
                {{"Brianna", "Arielle", "Kenneth", "Jontron", "Chase", "Ryan"},
                {"Vincent", "Nick", "Layne", "Jason", "Luke", "David", "Andrew"},
                {"-------", "-------", "-------", "Cameron", "Murph", "Nicko"}};
        printMdArray(classroom);
        System.out.println();

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                if(classroom[i][j].equals("Jontron")){
                    System.out.println("Jontron's seat is at: (" + i + ", " +  j + ")");
                }
            }
        }
        System.out.println();

        markX(2, 1);
        markX(3, 4);
        markX(2, 2);

    }

    private static void printMdArray(int[][] array){
        for (int[] i : array) {
            for (int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static void printMdArray(String[][] array){
        for (String[] i : array) {
            for (String j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static void markX(int row, int column){
        String[][] dashArray = new String[5][5];
        for (int i = 0; i < dashArray.length; i++) {
            for (int j = 0; j < dashArray[i].length; j++) {
                dashArray[i][j] = "-";
            }
        }
        dashArray[row][column] = "X";
        printMdArray(dashArray);
        System.out.println();
    }

}
