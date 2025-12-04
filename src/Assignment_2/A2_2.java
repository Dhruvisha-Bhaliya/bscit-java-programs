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

//Write a java program to check if a person is eligible to vote or not.

public class A2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not Eligible for vote");
        }
        // TODO code application logic here
    }
    
}
