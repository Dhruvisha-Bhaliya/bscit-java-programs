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
12.Write a Java program to insert an element (specific position) into an array.
 */
public class A5_12 {

    public static void main(String[] args) {
        int index, element;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements.");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index number.");
        index = sc.nextInt();
        System.out.println("Enter the new number.");
        element = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                a[i] = element;
            }
        }
        System.out.println("New Array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // TODO code application logic here
    }

}
