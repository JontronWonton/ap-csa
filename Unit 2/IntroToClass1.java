// Jonathan Klein
// 9/18/19
// IntroToClass1.java

import java.util.ArrayList;
import java.util.Scanner;

public class IntroToClass1 {
    public static void main(String[] args) {

        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("apple");
        inventory.add("banana");
        inventory.add("avocado");
        inventory.add("pineapple");
        inventory.add("pear");

        ArrayList<String> receipt = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        Scanner temp = new Scanner(System.in);

        String keepShopping;
        boolean running = true;
        int price = 0;
        int amount;

        System.out.println("Welcome to Dollar Plus, where everything is $1!");

        while(running){
            System.out.println("What would you like to buy?\n- Apple \n- Banana\n- Avocado\n- Pineapple\n- Pear");
            String current = in.next().toLowerCase().trim();

            if(inventory.contains(current)){
                System.out.println("How many " + current + "s would you like?");
                amount = in.nextInt();
                price += amount;
                receipt.add(amount + " " + current + "s");
                System.out.println("Successfully bought " + amount + " " + current + "s for " + amount + " dollars.");
            }

            System.out.println("Would you like to continue shopping? (Y/N)");
            keepShopping = temp.nextLine().toLowerCase().trim();

            running = keepShopping.equals("y");

        }
        System.out.println("Have a nice day!\nYou spent: " + price + " dollars\n" + receipt.toString());
        in.close();
    }
}
