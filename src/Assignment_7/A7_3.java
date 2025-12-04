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
3.Write a program to check if the word 'orange' is present in the "This is orange juice".
*/

public class A7_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1 = sc.next();
        System.out.println("Enter String2: ");
        String str2 = sc.next();
        System.out.println(str1.contains(str2));
        // TODO code application logic here
    }
    
}
