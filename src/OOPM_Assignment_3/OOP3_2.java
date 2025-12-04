/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_3;

/**
 *
 * @author DHRUVI
 */
public class OOP3_2 {
String prod_code,prod_name;
    int stock_in_hand;

    public OOP3_2() {
        stock_in_hand = 10;
    }
   
    public OOP3_2(int stock_in_hand) {
        this.stock_in_hand = stock_in_hand;
    }

    public static void main(String[] args) {
        OOP3_2 obj1 = new OOP3_2();
        OOP3_2 obj2 = new OOP3_2(20);
       
        System.out.println("stock is:"+obj1.stock_in_hand);
        System.out.println("stock is:"+obj2.stock_in_hand);
      }
    
}

