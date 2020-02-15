// Jonathan Klein
// 10/7/19
// Loops2.java

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        line();

        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }

        line();

        for(int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }

        line();

        for(int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }

        line();

        for(int i = 0; i <= 10; i++){
            System.out.print(((int) (Math.random()*100)+1) + " ");
        }

        line();

        for(int i = 0; i <= 20; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        line();

        System.out.println("Enter a number between 1 and 100.");
        int intIn = in.nextInt();
        for(int i = intIn; i <= 100; i++){
            System.out.print(i + " ");
        }

        line();

        System.out.println("Enter your name.");
        String strIn = in.next();
        System.out.println("Enter an integer.");
        intIn = in.nextInt();
        for(int i = 1; i <= intIn; i++){
            System.out.print(strIn + " ");
        }

        line();

        String asterisks = "*******";
        String result = "";
        for(int i = 1; i <= 7; i++){
            result = result.concat(String.valueOf(i));
            System.out.println(result + asterisks.substring(result.length()));
            }

        line();

    }
    private static void line(){
        System.out.println();
        for(int i=0; i<100; i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
