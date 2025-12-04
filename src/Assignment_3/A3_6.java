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
//Write a java program to take input of 10 integers from user. Print the average value of these numbers.
public class A3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number" + i);
            int n = sc.nextInt();
            avg = avg + n;

        }
        avg = avg / 10;
        System.out.println(avg);
        // TODO code application logic here
    }

}
