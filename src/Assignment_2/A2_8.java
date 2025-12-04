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

/*
Write a java program to check if a number entered by the user is a two digit, 
three digit or a four digit number.
*/

public class A2_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        
        if(number >= 10 && number <= 99)
        {
            System.out.println("two digit");
        }
        else if(number >= 100 && number <= 999)
        {
            System.out.println("three digit");
        }
        else if(number >= 1000 && number <= 9999)
        {
            System.out.println("four digit");
        }
        else
        {
            System.out.println("wrong input");
        }
        // TODO code application logic here
    }
    
}
