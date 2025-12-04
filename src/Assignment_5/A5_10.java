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
10.Write a Java program to find the common elements between two arrays of integers. 
   Insert those common elements in third array and display it.
*/

public class A5_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] comon = new int[n];
        
        System.out.println("Enter elements array2: ");
        for(int i = 0;i < a1.length;i++){
            a1[i] = sc.nextInt();
        }
        
        System.out.println("Enter elements array1: ");
        for(int i = 0 ; i < a2.length;i++){
            a2[i] = sc.nextInt();
        }
        
        System.out.println("Common elements are: ");
        for(int i = 0 ; i < a1.length ; i++){
            for(int j = 0 ;j < a2.length ; j++){
                if(a1[i] == a2[j]){
                       comon[j] = a2[j];
                       System.out.println(comon[j]);
                }
            }
        }
        
        // TODO code application logic here
    }
    
}
