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
4.Write a java program to take input in two 2 dimensional array of size 2*2. 
Perform subtraction of both the arrays and display the resulting array.
 */
public class A6_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter position [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        int[][] b = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter position[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] - b[i][j];
                System.out.print(result[i][j]);
            }
        }
        System.out.println();
        // TODO code application logic here
    }

}
