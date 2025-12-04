/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_6;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Part-2

1.Create another class employee which inherits branch class.

2.Employee class data member(private)-Empname ,  designation ,salary

3.Now,take input from user for fields- bankname , banktype , branchno,branch city,
  empname,designation,salary,Display all the details taken as input

Hint:use object of child class only.

*/

class bank {

    private String bank_name;
    private String bank_type;

    public bank(String bank_name, String bank_type) {
        this.bank_name = bank_name;
        this.bank_type = bank_type;
    }

    public String getBank_name() {
        return bank_name;
    }

    public String getBank_type() {
        return bank_type;
    }

}

class branch extends bank {

    private int branch_no;
    private String branch_city;

    public branch(String bank_name, String bank_type, int branch_no, String branch_city) {
        super(bank_name, bank_type);
        this.branch_no = branch_no;
        this.branch_city = branch_city;
    }

    public int getBranch_no() {
        return branch_no;
    }

    public String getBranch_city() {
        return branch_city;
    }
}

class Employee extends branch{
    private String Empname;
    private String designation;
    private int salary;

    public Employee(String bank_name, String bank_type, int branch_no, String branch_city,String Empname, String designation, int salary) {
        super(bank_name, bank_type, branch_no, branch_city);
        this.Empname = Empname;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmpname() {
        return Empname;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }
    
    
}

public class OOP6_P_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bank name: ");
        String bank_name = sc.nextLine();

        String bank_type;
        while (true) {
            System.out.println("Enter Bank type(gov or non-gov): ");
            bank_type = sc.nextLine();
            if (bank_type.equalsIgnoreCase("gov") || bank_type.equalsIgnoreCase("non-gov")) {
                break;
            } else {
                System.out.println("Invalid bank type. Please enter 'gov' or 'non-gov'.");
            }
        }

        System.out.println("Enter Branch no: ");
        int branch_no = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Branch city: ");
        String branch_city = sc.nextLine();
        
        System.out.println("Enter Employee name: ");
        String Empname = sc.nextLine();
        
        System.out.println("Enter designation: ");
        String designation = sc.nextLine();
        
        System.out.println("Enter Employee salary: ");
        int salary = sc.nextInt();

        Employee b1 = new Employee(bank_name, bank_type, branch_no, branch_city,Empname,designation,salary);

        System.out.println("\nBank Details: ");
        System.out.println("Bank name: " + b1.getBank_name());
        System.out.println("Bank type: " + b1.getBank_type());
        System.out.println("Branch no: " + b1.getBranch_no());
        System.out.println("Branch city: " + b1.getBranch_city());
        System.out.println("Employee name: "+b1.getEmpname());
        System.out.println("Employee designation: "+b1.getDesignation());
        System.out.println("Employee salary: "+b1.getSalary());
        
        // TODO code application logic here
    }

}


