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
5.Create a user defined function that takes string as input parameter and checks 
whether it is palindrome or not.

eg: str = “MOM”
output: palindrome

 */
public class A8_5 {

    static void palindrom(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.println("This is palindrom");
        } else {
            System.out.println("This is not palindrom");
        }
    }

    public static void main(String[] args) {
        palindrom("diid");
        // TODO code application logic here
    }

}
