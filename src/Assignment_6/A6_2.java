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
Write a java program to create a 2*3 matrix. Take input elements of type 
char from user and display the transpose of the same.
*/

public class A6_2 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Declare and initialize a 2D array of size 2x3
        char[][] matrix = new char[2][3];

        // Input elements for the matrix
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.next().charAt(0);
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and display the transpose of the matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}