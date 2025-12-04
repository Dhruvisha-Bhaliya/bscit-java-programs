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
6.Write a Java program to remove a specific element from an array.
*/

public class A5_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n: ");
       int n = sc.nextInt();
       
       int a[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0 ;i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter elements you want to remove: ");
        int element = sc.nextInt();
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != element){
                System.out.println("a["+i+"]="+a[i]);
            }
        }
    }
    
}
