/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_4;

/**
 *
 * @author DHRUVI
 */

/*

1.Private variables : 

size – it can store values like small, medium, large
num_of_cheese_topping – it can take an integer value

2.Constructor(s) that set all of the instance variables. 
If no parameter is passed then by default set size =“small”, num_of_cheese_topping = 1
(hint: so the class will have one parameterized and one default constructor)

3.Public methods to get and set the instance variables.
(example: getsize(), setsize(), getnum_of_cheese_topping(), …..)

4.Public method calc_bill() which returns cost of pizza
Calculate cost as follows:
Small : 200 + 30rs per topping
Medium : 350 + 40rs per topping
Large : 500 +  50rs per topping

Example: size=medium, num_of_cheese_topping = 2, 
Total_cost = 350 + 80(40*2) = 430

5.Public method named getdescription() which prints the size of pizza and 
the number of toppings.


*/

class pizza{
    private String size;
    private int num_of_cheese_topping;

    public pizza() {
        this.num_of_cheese_topping = 1;
        this.size = "small";
    }
    
    public pizza(String size,int num_of_cheese_topping){
        this.size = size;
        this.num_of_cheese_topping = num_of_cheese_topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNum_of_cheese_topping() {
        return num_of_cheese_topping;
    }

    public void setNum_of_cheese_topping(int num_of_cheese_topping) {
        this.num_of_cheese_topping = num_of_cheese_topping;
    }
    
    public int calc_bill(){
        int cost = 0;
        if(size == "small"){
            cost = 200 +(30*num_of_cheese_topping);
        }else if(size == "Medium"){
            cost = 350 +(40*num_of_cheese_topping);
        }else if(size == "Large"){
            cost = 500 +(50*num_of_cheese_topping);
        }
        return cost;
    }
    
    public void getdecription(){
        System.out.println("Size: "+size);
        System.out.println("Num_of_cheese_toppings: "+num_of_cheese_topping);
    }
}


public class OOP4_1 {

    public static void main(String[] args) {
        pizza p1 = new pizza();
        
        pizza p2 = new pizza("Medium",2);
        
        pizza p3 = new pizza();
        p3.setNum_of_cheese_topping(3);
        p3.setSize("Large");
        
        
        p1.getdecription();
        System.out.println("cost of pizza with small size is: "+p1.calc_bill()+" Rs.");
        p2.getdecription();
        System.out.println("cost of pizza with medium size is: "+p2.calc_bill()+" Rs.");
        p3.getdecription();
        System.out.println("cost of pizza with large size is: "+p3.calc_bill()+" Rs.");
        // TODO code application logic here
    }
    
}
