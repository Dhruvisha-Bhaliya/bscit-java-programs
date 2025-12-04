/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Draw pattern as given below using loop

Input : n=5

Output
* * * * *
*
*
*
* * * * *
*/
public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= n - 1; i++) {
           // System.out.println("*");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        // TODO code application logic here
    }
    
}
