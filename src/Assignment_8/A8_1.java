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
1.Create a user defined function that takes an integer as an input parameter
and prints whether it is a prime number or not.
 */
public class A8_1 {

    static void prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not prime number");
        }
    }

    public static void main(String[] args) {
        prime(1);
        // TODO code application logic here
    }

}
