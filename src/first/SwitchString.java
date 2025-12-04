/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first;

/**
 *
 * @author DHRUVI
 */
public class SwitchString {

    public static void main(String[] args) {
        String levelString = "Beginners";
        int level = 0;
        switch (levelString) {
            case "Beginners":level = 1;
            break;
            case "Intermediate":level = 2;
            break;
            case "Expert":level = 3;
            break;
            default:level = 0;
            break;
        }
        System.out.println("Your level is: "+level);
        // TODO code application logic here
    }

}
