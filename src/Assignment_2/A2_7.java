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
Write a java program to take input of marks in two subjects. Calculate percentage and based on percentage,
display grades as below:

>=70 : Distinction
Between 60-69: first class
Between 50-59 : second class
Between 40-49 : Pass class
Less than 40 : fail

*/

public class A2_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        
        if(marks >= 70)
        {
            System.out.println("Distinction");
        }
        else if(marks >= 60 && marks <= 69)
        {
            System.out.println("First class");
        }
        else if(marks >= 50 && marks <= 59)
        {
            System.out.println("second class");
        }
        else if(marks >= 40 && marks <= 49)
        {
            System.out.println("Pass class");
        }
        else if(marks <= 40)
        {
            System.out.println("Fail");
        }
        // TODO code application logic here
    }
    
}
