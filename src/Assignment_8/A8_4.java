/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_8;

/**
 *
 * @author DHRUVI
 */

/*
4.Create a user defined function which takes an integer as input parameter 
and returns the sum of its digits.
 */
public class A8_4 {

    static void digit(int n) {
        int t = 0, rem;
        for (t = 0; n > 0; n = n / 10) {
            rem = n % 10;
            t = t + rem;
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        digit(34);
        // TODO code application logic here
    }

}
