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
7. Write a java program to accept two strings as input from user. 
Check whether both the strings are equal or not.
*/

public class A7_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.next();
         System.out.println("Enter string2: ");
        String str2 = sc.next();
        System.out.println(str1.equals(str2));
        
        // TODO code application logic here
    }
    
}
