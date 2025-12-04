/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_8;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Create a user defined function that takes the size of two matrices. 
Take input elements from user and store them in those matrices. 
Create another user defined function for matrix multiplication and print the resulting matrix.

Sample calculation for matrix multiplication.

 */
public class A8_6 {

    static void udf(int A[][], int B[][]) {
        int i, j, k;
        int C[][] = new int[10][10];
        System.out.println("Resultant Matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(" " + C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i, j;
        int A[][] = new int[10][10];
        int B[][] = new int[10][10];

        System.out.println("First Matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = read.nextInt();
            }
            System.out.println();
        }

        System.out.println("second Matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                B[i][j] = read.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("First Matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + B[i][j] + " ");
            }
            System.out.println();
        }

        // Find the product of the 2 matrices
        udf(A, B);

        // TODO code application logic here
    }

}
