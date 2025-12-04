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

//Write a java program to check greatest of two numbers.

public class A2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();
        
        if(number1 > number2)
        {
            System.out.println("number1 is greater");
        }
        else
        {
            System.out.println("number2 is greater");
        }
        // TODO code application logic here
    }
    
}
