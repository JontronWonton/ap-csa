// Jonathan Klein
// 9/24/19
// IfElse.java

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter three numbers.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(line());

        if(num1 == 5){
            System.out.println("num1 is equal to 5.");
        } else {
            System.out.println("num1 is not equal to 5.");
        }

        if(num2 == 5){
            System.out.println("num2 is equal to 5.");
        } else {
            System.out.println("num2 is not equal to 5.");
        }

        if(num3 == 5){
            System.out.println("num3 is equal to 5.");
        } else {
            System.out.println("num3 is not equal to 5.");
        }

        System.out.println(line());

        if(num1 + num2 + num3 == 0.5){
            System.out.println("sum is a double.");
        } else {
            System.out.println("sum is not a double.");
        }

        System.out.println(line());

        if(num1 > num2 && num1 > num3){
                System.out.println("num1 is the largest of the numbers.");
            } else if(num2 > num1 && num2 > num3){
                System.out.println("num2 is the largest of the numbers.");
            } else if(num3 > num1 && num3 > num2){
            System.out.println("num3 is the largest of the numbers");
        }

        if(num1 < num2 && num1 < num3){
            System.out.println("num1 is the smallest of the numbers.");
        } else if(num2 < num1 && num2 < num3){
            System.out.println("num2 is the smallest of the numbers.");
        } else if(num3 < num1 && num3 < num2){
            System.out.println("num3 is the smallest of the numbers");
        }

        System.out.println(line());

        if(num1 < num2){
            if(num2 < num3){
                System.out.println("numbers are in ascending order.");
            } else {
                System.out.println("numbers are not in ascending order.");
            }
        } else {
            System.out.println("numbers are not in ascending order.");
        }

        int max = 0;
        int mid = 0;
        int min = 0;

        if(num1 > num2 && num1 > num3){
            max = num1;
            if(num2 > num3){
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        } else if(num2 > num1 && num2 > num3){
            max = num2;
            if(num1 > num3){
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        } else if(num3 > num1 && num3 > num2){
            max = num3;
            if(num1 > num2){
                mid = num1;
                min = num2;
            } else {
                mid = num2;
                min = num1;
            }
        }

        System.out.println(min + ", " + mid + ", " + max);

    }

    private static String line(){
        return "=====================================";
    }

}
