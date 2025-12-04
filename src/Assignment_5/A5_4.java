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
4.Write a Java program to read n array elements from user. check if an array contains a specific value.
*/

public class A5_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int find = 4;
        boolean found = false;
        
        System.out.println("Enter elements");
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i : a){
            if(i == find){
                found = true;
            }
        }
        if(found)
        {
            System.out.println(find+" found");
        }
        else{
            System.out.println(find+" not found");
        }
        // TODO code application logic here
    }
    
}
