/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_3;

/**
 *
 * @author DHRUVI
 */
//Write a java program to print a series of n odd numbers. Use any one type of loop.
public class A3_2 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        int n = 10;
        int counter;
        for (counter = 1; counter <= n * 2; counter += 2) {
            System.out.println(counter);
        }

        // TODO code application logic here
    }

}
