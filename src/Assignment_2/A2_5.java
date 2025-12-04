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

// Write a java program to check if a number is zero, positive or negative.

public class A2_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        
        if(number > 0)
            System.out.println("number is positive");
        else if(number < 0)
            System.out.println("number is negative");
        else
            System.out.println("number is zero");
        // TODO code application logic here
    }
    
}
