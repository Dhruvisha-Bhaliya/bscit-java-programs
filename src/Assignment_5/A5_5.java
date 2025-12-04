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
5.Write a Java program to read n array elements from user. find the index of a particular array element.
*/

public class A5_5 {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n:");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter elements: ");
        for(int i = 0 ;i < a.length ; i++ ){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter index number : ");
        int j = sc.nextInt();
        if(j < a.length){
            System.out.println("Array["+j+"]="+a[j]);
        }
        // TODO code application logic here
    }
    
}
