/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/* .Write a java program to find largest of 3 numbers. 
a.  Do it using logical operators 
b.  Do it using nested if
*/


public class A2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter number3: ");
        int number3 = sc.nextInt();
        
        if(number1 > number2 && number1 > number3)
                {
                    System.out.println("number1 is larger");
                }
        else if(number2 > number1 && number2 > number3)
        {
            System.out.println("number2 is larger");
        }
        else
        {
            System.out.println("number3 is larger");
        }
        // TODO code application logic here
    }
    
}
