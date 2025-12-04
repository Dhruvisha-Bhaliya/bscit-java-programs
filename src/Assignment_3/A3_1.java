/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
1.Write a java program to print table of n. Do it using three types of loops. 
Use scanner to take input of n from user.
*/

public class A3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        // USING WHILE LOOP:--
        
        int counter = 1;
        while(counter <= 10)
        {
            int mul = n * counter;
            System.out.println(n+" * "+counter+" = "+mul);
            counter++;
        }
        
        
        //USING DO WHILE LOOP:--
        
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int count = 1;
        do
        {
            int mul = num * count;
            System.out.println(num+" * "+count+" = "+mul);
            count++;
        }while(count <= 10);
        
        
        // FOR LOOP:--
        
         System.out.println("Enter number: ");
        int number = sc.nextInt();
          
        
        for (int i = 1; i <= 10; i++) {
            int mul = number * i;
            System.out.println(number+" * "+i+" = "+mul);
        }
        // TODO code application logic here
    }
    
}
