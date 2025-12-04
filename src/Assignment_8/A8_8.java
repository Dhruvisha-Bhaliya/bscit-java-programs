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
8.Create a user defined function which takes element input in a single dimensional array 
of size 10 and return the mean value of all values stored in the array.
 */
public class A8_8 {

    public static float mean(int n) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[n];
        float sum = 0;
        System.out.println("Enter elemenets");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        System.out.println("Mean of this array is: " + mean(n));

        // TODO code application logic here
    }

}
