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
5.Write a java program to take a string input from user. Count number of words and letters in it.
*/

public class A7_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        int tw ;
        String word[] = str.split("");/* This line splits the input string 'str' into individual 
        characters and stores them in an array of strings 'word'. 
        Since an empty string is used as the delimiter, each character becomes a 
        separate element in the array */
        tw = word.length;
        System.out.println(tw);
        // TODO code application logic here
    }
    
}
