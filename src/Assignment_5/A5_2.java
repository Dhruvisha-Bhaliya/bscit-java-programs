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
2.Take 10 integer elements as input from user. 
Display sum values of all elements of array.
 */
public class A5_2 {

    public static void main(String[] args) {
        int sum = 0;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum = " + sum);
    }
}
