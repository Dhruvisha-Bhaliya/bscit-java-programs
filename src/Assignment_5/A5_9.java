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
9.Write a Java program to reverse an array of integer values.
*/

public class A5_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter element: ");
        for(int i = 0 ;i < array.length ; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println("Reverse array: ");
        for(int i = array.length-1 ; i >= 0 ; i--){
            System.out.println(array[i]);
        }
        // TODO code application logic here
    }
    
}
