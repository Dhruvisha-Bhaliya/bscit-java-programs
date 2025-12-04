/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
9.Write a java program to take a string as input from user. 
Capitalize the first letter of all the words in the string and print it.
*/

public class A7_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        String part = str.substring(0,1);
        String Upper = part.toUpperCase();
        System.out.println(Upper);
        // TODO code application logic here
    }
    
}
