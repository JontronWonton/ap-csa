// Jonathan Klein
// 9/24/19
// guessNumGame.java

import java.util.Scanner;

public class guessNumGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int) ((Math.random()*25)+1);
        int guessedNum;
        boolean win = false;

        System.out.println("You have 5 tries to guess my number!\nIt's between 1 and 25.");
        guessedNum = input.nextInt();

        if(guessedNum > num){
            System.out.println("Too high!");
        } else if(guessedNum < num){
            System.out.println("Too low!");
        } else {
            win = true;
            System.out.println("You Win!!!");
        }

        if(!win) {
            System.out.println("Try again!");
            guessedNum = input.nextInt();
            if (guessedNum > num) {
                System.out.println("Too high!");
            } else if (guessedNum < num) {
                System.out.println("Too low!");
            } else {
                win = true;
                System.out.println("You Win!!!");
            }
        }

        if(!win) {
            System.out.println("Try again!");
            guessedNum = input.nextInt();
            if (guessedNum > num) {
                System.out.println("Too high!");
            } else if (guessedNum < num) {
                System.out.println("Too low!");
            } else {
                win = true;
                System.out.println("You Win!!!");
            }
        }

        if(!win) {
            System.out.println("Try again!");
            guessedNum = input.nextInt();
            if (guessedNum > num) {
                System.out.println("Too high!");
            } else if (guessedNum < num) {
                System.out.println("Too low!");
            } else {
                win = true;
                System.out.println("You Win!!!");
            }
        }

        if(!win) {
            System.out.println("Try again!");
            guessedNum = input.nextInt();
            if (guessedNum > num) {
                System.out.println("Too high!");
            } else if (guessedNum < num) {
                System.out.println("Too low!");
            } else {
                win = true;
                System.out.println("You Win!!!");
            }
        }

            if(!win){
                System.out.println("You lose! The number was " + num);
            }
        }
    }