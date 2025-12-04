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
2.Create a user defined function that returns the factorial of n. 
take input of n from user and pass it as a parameter while calling the function.
 */
public class A8_2 {

    static void fectorial(int num) {
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        fectorial(4);
        // TODO code application logic here
    }

}
