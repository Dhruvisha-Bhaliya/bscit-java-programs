/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPM_Assignment_8;

/**
 *
 * @author DHRUVI
 */

/*
Practical Assignment 8

Explain what’s wrong in the above diagram. How it can be solved? Implement the solution.
 */
interface Car {

    int mileage = 35;

    void drive();
}

interface petrol_car extends Car {

    default void drive() {
        System.out.println("Driving petrol car with mileage: " + mileage);
    }
}

interface CNG_car extends Car {

    default void drive() {
        System.out.println("Driving CNG car with mileage: " + mileage);
    }
}

class hybrid_car implements CNG_car, petrol_car {

    int petrolMileage = 35;
    int cngMileage = 35;
    int hybridMileage = 151;

    public void drive(int mileage) {
        System.out.println("Driving hybrid car with mileage: " + hybridMileage);
    }

    public void drive() {
        System.out.println("Driving hybrid car with petrol mileage: " + petrolMileage);
        System.out.println("Driving hybrid car with CNG mileage: " + cngMileage);
    }
}

public class OOP8_1 {

    public static void main(String[] args) {
        hybrid_car obj1 = new hybrid_car();
        obj1.drive();
        obj1.drive(151);
        
        Car c1 = new hybrid_car();
        c1.drive();

        // TODO code application logic here
    }

}
