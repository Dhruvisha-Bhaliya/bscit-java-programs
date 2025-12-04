/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_5;

import java.util.Arrays;

/**
 *
 * @author DHRUVI
 */

/*
11.Write a Java program to test the equality of two arrays.
 */
public class A5_11 {

    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8};
        int arr2[] = {2, 4, 6, 8};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }

}
