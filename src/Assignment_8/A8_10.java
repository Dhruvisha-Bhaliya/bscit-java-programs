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
10. Create a user defined function which takes length and breadth as input
parameter and checks whether the shape is square or rectangle.
 */
public class A8_10 {

    static void udf(float l, float w) {

        if (l == w) {
            System.out.println("This is Square");
        } else {
            System.out.println("This is rectangle");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length & width of the rectangle::");
        float l = in.nextFloat();
        float w = in.nextFloat();
        udf(l, w);
        // TODO code application logic here
    }

}
