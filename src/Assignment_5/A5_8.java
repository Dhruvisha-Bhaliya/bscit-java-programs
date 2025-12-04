/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_5;

/**
 *
 * @author DHRUVI
 */

/*
8.Write a Java program to find the maximum and minimum value of an array.  
*/

public class A5_8 {

    public static void main(String[] args) {
        int n= 5;
        int min = 0,max = 0;
        int[] a = {1,2,3,4,5};
        
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
            min = a[0];
            if(min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }
        
        System.out.println("Maximum value is : "+max);
        System.out.println("Minimum value is : "+min);
        
        // TODO code application logic here
    }
    
}
