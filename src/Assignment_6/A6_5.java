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
5.Write a java program to create a 3*3 array. Read values from the user and store in the array. 
find the sum of odd values in the array and display the same.
 */
public class A6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter position[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] % 2 != 0) {
                    sum = sum + a[i][j];
                    System.out.print(a[i][j]);
                }

                System.out.println("");
            }
            System.out.println("Result: " + sum);

        }
    }

}
