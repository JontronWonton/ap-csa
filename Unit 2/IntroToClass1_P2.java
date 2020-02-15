// Jonathan Klein
// 9/18/19
// IntroToClass1.java

import java.util.Scanner;

public class IntroToClass1_P2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Dollar Plus, where everything is $1!\nPlease enter the 5 items you want, separated by spaces.\nEx. 5 apples");
        int price1 = in.nextInt();
        String item1 = in.next();
        int price2 = in.nextInt();
        String item2 = in.next();
        int price3 = in.nextInt();
        String item3 = in.next();
        int price4 = in.nextInt();
        String item4 = in.next();
        int price5 = in.nextInt();
        String item5 = in.next();

        int total = price1 + price2 + price3 + price4 + price5;

        System.out.println("Have a nice day!\nYou spent: " + total + " dollars\nYou bought: " + item1 + ", " + item2 + ", " + item3 + ", " + item4 + ", " + item5);
        in.close();
        }

    }
