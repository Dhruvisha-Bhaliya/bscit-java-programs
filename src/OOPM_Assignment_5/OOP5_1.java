/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Practical Assignmen5
Aim: Implement Exception Handling in java

• With reference to assignment 4,handle exceptions as follows.

• Withing  set num_of_cheese_topping(int num),if user passes string value in 
parameters then, print -“Error: Format mismatch”. Note: use InputMismatch in catch.

• If user passes any value which is equal to or less than zero then throw 
  user defind exception and print ”Invalid number”.

• Finally,whether exception is there or not in set num_of_cheese_topping,
  at the end of method you should print “setmethod called”.

*/
class pizza {

    private String size;
    private int num_of_cheese_topping;

    public pizza() {
        this.num_of_cheese_topping = 1;
        this.size = "small";
    }

    public pizza(String size, int num_of_cheese_topping) {
        this.size = size;
        this.num_of_cheese_topping = num_of_cheese_topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNum_of_cheese_topping() {
        return num_of_cheese_topping;
    }

    public void setNum_of_cheese_topping() {
        try {
            Scanner sc = new Scanner(System.in);
            int num_of_cheese_topping = sc.nextInt();
            if (num_of_cheese_topping <= 0) {
                throw new ArithmeticException("Number of cheese toppings cannot be less than zero");
            } else {
                this.num_of_cheese_topping = num_of_cheese_topping; // Update the number of cheese toppings
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter a valid integer for the number of cheese toppings.");
        } catch (ArithmeticException e) {
            System.out.println("Invalid Input: Number of cheese toppings must be greater than zero.");
        } finally {
            System.out.println("Set method called");
        }
    }

    public int calc_bill() {
        int cost = 0;
        if (size == "small") {
            cost = 200 + (30 * num_of_cheese_topping);
        } else if (size == "Medium") {
            cost = 350 + (40 * num_of_cheese_topping);
        } else if (size == "Large") {
            cost = 500 + (50 * num_of_cheese_topping);
        }
        return cost;
    }

    public void getdecription() {
        System.out.println("Size: " + size);
        System.out.println("Num_of_cheese_toppings: " + num_of_cheese_topping);
    }
}

public class OOP5_1 {

    public static void main(String[] args) {
        pizza p1 = new pizza();

        pizza p2 = new pizza("Medium", 2);

        pizza p3 = new pizza();
        p3.setNum_of_cheese_topping();
        p3.setSize("Large");

        p1.getdecription();
        System.out.println("cost of pizza with small size is: " + p1.calc_bill() + " Rs.");
        p2.getdecription();
        System.out.println("cost of pizza with medium size is: " + p2.calc_bill() + " Rs.");
        p3.getdecription();
        System.out.println("cost of pizza with large size is: " + p3.calc_bill() + " Rs.");
        // TODO code application logic here
    }

}
