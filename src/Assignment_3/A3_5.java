/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */
//Write a java program to print Fibonacci series of n terms where n is input by user.
public class A3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int a = 0, b = 1, c;

        System.out.println("Fibonacci Series up to " + number + ":");
        System.out.print(a + " ");

        for (int i = 1; i < number; i++) {
            System.out.print(b + " ");
            c = a + b;
            a = b;
            b = c;
        }

        // TODO code application logic here
    }

}
