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
//.Write a java program to find the factorial value of n number entered through the keyboard.
public class A3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        int fact = 1;

        for (int i = value; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        // TODO code application logic here
    }

}
