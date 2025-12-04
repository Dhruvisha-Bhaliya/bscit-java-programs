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
9.Create a user defined function which takes 3 integers as 
input parameters and returns the second largest number amongst them.
 */
public class A8_9 {

    static void udf(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println("The largest number is:" + a);
        } else if (b > c) {
            System.out.println("The largest number is:" + b);
        } else {
            System.out.println("The largest number is:" + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        udf(a, b, c);
    }

}
