/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPM_Assignment_9;

/**
 *
 * @author DHRUVI
 */

/*
Create a class named Discount that includes three overloaded computDiscount()  methods 
for purchasing CoffeeTable.

1.When computeDiscount() receives  a single parameter, it represents the price of 
one CoffeeTable ordered. Give 8% discount,and return the total due. 

2.When computeDiscount() receives two parameters,they represent the price of a 
CoffeeTable and the quantity ordered.Multiply the two values,Give 8% discount,and return the total due.

3.When computeDiscount() receives three parameters,they represent the price of a 
CoffeeTable,quantity ordered,and a coupen value.Multiply the quantity and price,reduce 
the result by the coupon value,and then give 8% discount and return total due.

Create class Teatdiscount with main method that tests all three overloaded methods.

 */
class Discount {

    public double computeDiscount(double price) {
        double discount = 0.08;
        double totalDue = price - (price * discount);
        return totalDue;
    }

    public double computeDiscount(double price, double quantity) {
        double discount = 0.08;
        double totalDue = (price * quantity) - ((price * quantity) * discount);
        return totalDue;
    }

    public double computeDiscount(double price, int quantity, double couponValue) {
        double discount = 0.08;
        double totalBeforeCoupon = price * quantity;
        double totalAfterCoupon = totalBeforeCoupon - couponValue;
        double totalDue = totalAfterCoupon - (totalAfterCoupon * discount);
        return totalDue;
    }
}

public class OOP9_1 {

    public static void main(String[] args) {
       Discount d1 = new Discount();
       
       double totalDue1 = d1.computeDiscount(1000.0);
        System.out.println("Total Due with 8% discount; $"+totalDue1);
        
        double totalDue2 = d1.computeDiscount(1000.0, 2);
        System.out.println("Total Due for 2 CoffeeTableswith 8% discount: $"+totalDue2);
        
        double totalDue3 = d1.computeDiscount(1000.0, 3, 50.0);
        System.out.println("Total Due for 3 CoffeeTables with $50 coupon and 8% discount: $"+totalDue3);
        // TODO code application logic here
    }

}
