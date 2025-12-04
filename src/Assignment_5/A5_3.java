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
3.Write a Java program to calculate the average value of 10 array elements entered by the user.
*/

public class A5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
                
        int sum = 0,avg = 0;
        
        System.out.println("Enter elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            avg = sum/arr.length;
        }
            System.out.println(avg);
        
        // TODO code application logic here
    }
    
}
