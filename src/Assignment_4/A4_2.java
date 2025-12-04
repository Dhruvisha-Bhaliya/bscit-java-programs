/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_4;

/**
 *
 * @author DHRUVI
 */

/*
2.Write a java program to print following pattern for n=5

5
4  4  
3  3   3
2  2   2   2
1  1   1   1   1

*/

public class A4_2 {

    public static void main(String[] args) {
        
        // TODO code application logic here
         for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
  