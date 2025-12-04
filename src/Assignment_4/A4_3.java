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
3.Write a java program to print following pattern for n=5

1
0  1 
1  0   1
0  1   0   1
1  0   1   0   1

*/

public class A4_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0)
                System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println("");
        }
    }
    
}
