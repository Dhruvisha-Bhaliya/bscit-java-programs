/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
1.Write a java program to ask user – how many elements he wants to enter? 
Read elements entered by user in an array. Display the elements of array.
*/

public class A5_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
           a[i]=sc.nextInt();
            
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(+a[i]);
            
        }
    }
    
}
