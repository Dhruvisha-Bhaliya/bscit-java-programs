/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Write a java program to implement a do-while loop that asks 
the user to enter two numbers. The numbers should be added and the sum must be displayed. 
In every iteration of loop, user should be asked whether he/she wishes to perform the operation again. 
If so, the loop should repeat; otherwise it should be terminated.

 */
public class A3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e;
        do {
            System.out.println("Enter First number=");
            int a = sc.nextInt();

            System.out.println("Enter Second number=");
            int b = sc.nextInt();

            int total = a + b;
            System.out.println("The total is =" + total);

            System.out.println("You want Continue Enter :");
            e = sc.nextInt();

        } while (e == 1);// 1  for yes response and 0 for no response
        System.out.println("Thank you for using the program!");
        sc.close();
        // TODO code application logic here
    }

}
