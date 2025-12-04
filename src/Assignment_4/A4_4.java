/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
4.Write a java program to print following pattern for n=5
      
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5

*/

public class A4_4 {

    public static void main(String[] args) {
        // TODO code application logic here
         int i,j,k=0,n;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n: ");
       n=input.nextInt();
       for(i=1; i<=n; i++){
           for(j=1;j<=n-i;j++){
               System.out.print(" ");
           }
       
          
           for(j=1;j<=i;j++)
           {
               System.out.print(+j+" ");
               
           }
           System.out.println();
       }
    

    }
    
}
