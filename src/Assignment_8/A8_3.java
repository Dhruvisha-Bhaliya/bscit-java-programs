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
Create a user defined function which takes an integer as input parameter and returns the
length of that number i.e the number of digits it contains.
 */
public class A8_3 {

    static void digit(int num) {
        int count = 0;
        do {
            num = num / 10;
            count++;

        } while (num != 0);
        System.out.println(count);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        digit(34);
    }

}
