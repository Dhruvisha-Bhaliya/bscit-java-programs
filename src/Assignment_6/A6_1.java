/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
1. Write a java program to create a 2*4 matrix. Take input elements from user and display the same.
*/

public class A6_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
       
        int[][] a = new int[2][4];
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    
}
