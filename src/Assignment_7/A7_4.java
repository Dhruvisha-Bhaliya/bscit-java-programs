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
4.Write a program that takes your full name as input and displays the abbreviations of 
the first and middle names except the last name which is displayed as it is. For example, 
if your name is Nikita Manish Patel, then the output should be N.M.Patel.
*/

public class A7_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String fn = sc.next();
        
        System.out.println("Enter middle name: ");
        String mn = sc.next();
        
        System.out.println("Enter last name: ");
        String ln = sc.next();
        
         System.out.println(fn.charAt(0)+"."+mn.charAt(0)+"."+ln);
        
        // TODO code application logic here
    }
    
}
