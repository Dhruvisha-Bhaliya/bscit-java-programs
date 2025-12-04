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
7.Create a user defined function to reverse a string without using inbuilt string function – reverse.
 */
public class A8_7 {

    static void reverse(int num) {
        int count, sum = 0;
        do {
            count = num % 10;
            sum = sum * 10 + count;
            num = num / 10;
        } while (num != 0);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        reverse(12345);
        // TODO code application logic here
    }

}
