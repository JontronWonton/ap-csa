// Jonathan Klein
// 10/3/2019
// Loops1.java

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {

        line();

        int counter = 1;
        while(counter<=50){
            System.out.print(counter + " ");
            counter++;
        }

        line();

        counter = 1;
        while(counter<=100){
            if(counter%5==0){
                System.out.print(counter + " ");
            }
            counter++;
        }

        line();

        Scanner input = new Scanner(System.in);
        int num = (int) ((Math.random()*5)+1);
        int guessedNum;
        boolean win = false;

        while (!win){
            System.out.println("Can you guess my number?\nIt's between 1 and 5. (Inclusive)");
            guessedNum = input.nextInt();
            if(guessedNum > num){
                System.out.println("Too high!");
            } else if(guessedNum < num){
                System.out.println("Too low!");
            } else {
                win = true;
                System.out.print("You Win!!!");
            }
        }

        line();

        System.out.println("Facts Machine:\nSay 'bye' to exit!");
        String idk = input.nextLine();
        String[] facts = {"You are more likely to get a sunburn between 10 in the morning and 4 in the afternoon",
                "The most common name in the world is Mohammed.",
                "In the average lifetime, a person will walk the equivalent of 5 times around the equator.",
                "Diet Coke was only invented in 1982.",
                "Negative 40 degrees Celsius is exactly the same as negative 40 degrees Fahrenheit."};
        int random;
        while (!idk.equals("bye")){
            random = (int) ((Math.random()*facts.length));
            System.out.println("Did you know: " + facts[random]);
            idk = input.nextLine();
        }


    }

    private static void line(){
        System.out.println("\n");
        for(int i=0; i<100; i++){
            System.out.print("=");
        }
        System.out.println("\n");
    }
}
