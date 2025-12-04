/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Write a java program to take basic salary of an employee as input.
Calculate its gross salary according to following:

For Basic salary (BS) <= 10000
HRA = 20% of BS , DA = 80% BS

For Basic salary (BS) <= 20000
HRA = 25% of BS , DA = 90% BS

For Basic salary (BS) <= 20000
HRA = 30% of BS , DA = 95% BS

Gross Salary = BS + HRA + DA
*/
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double HRA = 0,DA = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic salary: ");
        double basic_salary = sc.nextInt();
        
        if(basic_salary <= 10000)
        {
            HRA = 0.2 * basic_salary;
            DA = 0.8 * basic_salary;
           
        }else if(basic_salary <= 20000)
        {
            HRA = 2.5 * basic_salary;
            DA = 0.9 * basic_salary;
        }
        else if(basic_salary > 20000)
        {
            HRA = 0.3 * basic_salary;
            DA = 9.5 * basic_salary;
        }
        else{
            System.out.println("No output");
        }
        
        
        double gross_salary = basic_salary + HRA + DA;
        System.out.println("gross salary of employee is: "+gross_salary);
        
        
    
        // TODO code application logic here
    }
    
}
