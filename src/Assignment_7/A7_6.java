/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_7;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
6.Write a java program to take string input from a user. 
Find the number of occurences of letter ‘i’ in that string.
*/

public class A7_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        
        char search = 'i';
        int count = 0;
        
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)==search){
                count++;
            }
        }
       System.out.println("The character"+search+"appears"+count+"times");
    }
    
}
