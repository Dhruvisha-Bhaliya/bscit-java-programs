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

//Write a java program to check if a year is a leap year or not.

public class A2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int Year = sc.nextInt();
        
        if(Year%4 == 0)
        {
            System.out.println("Given Year "+Year+" is Leap");
        }
        else
        {
            System.out.println("Given Year "+Year+" is Not Leap");
        }
        // TODO code application logic here
    }
    
}
