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
1.Write a java program to print following pattern for n=5

1
1  2  
1  2   3
1  2   3   4
1  2   3   4   5

*/

public class A4_1 {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        // TODO code application logic here
    }
    
}
