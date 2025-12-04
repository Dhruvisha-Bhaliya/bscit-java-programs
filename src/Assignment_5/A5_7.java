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
7.Write a Java program to copy elements of one array to the other array by iterating the array.
*/

public class A5_7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        
        int a1[] = new int[n];
        
        System.out.println("Enter elements: ");
        for(int i = 0 ;i <n; i++){
            a1[i] = sc.nextInt();
        }
        
        System.out.println("Original array: ");
        for(int i = 0 ; i < a1.length;i++){
            System.out.println(a1[i]);
        }
        
        int a2[] = new int[a1.length];
        
        for(int i = 0 ; i <n;i++){
            a2[i] = a1[i];
        }
        System.out.println("New Array: ");
        for(int i = 0 ; i < a2.length ; i++){
            System.out.println(a2[i]);
        }
    }
    
}
