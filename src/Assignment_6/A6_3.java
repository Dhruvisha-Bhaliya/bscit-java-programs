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
Write a java program to create a 3*3 matrix. Take input elements from user and display the same. 
Create another matrix. Copy the elements of original matrix into the newly created matrix 
and replace the even values with 0.
 */
public class A6_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter position: [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] % 2 == 0) {
                    b[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
            // TODO code application logic here
        }

    }
}
