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
Practical Assignment6

Aim : Implement Inheritance in java 

Part-1

1.Define two classes Bank and Branch. 

2.Bank class data member(private)-bank name and bank type
  Values of bank type can be-(gov or non-gov).

3.Branch class inherit Bank.

4.In Branch class data members(private)-branch no and branch city.

5.Develop a java program to take input of bank name,bank type,branch no and branch 
  city from user and Display all the details.

Hint : create the object of child class only.

 */
class Bank {

    private String bank_name;
    private String bank_type;

    public Bank(String bank_name, String bank_type) {
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

class Branch extends Bank {

    private int branch_no;
    private String branch_city;

    public Branch(String bank_name, String bank_type, int branch_no, String branch_city) {
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

public class OOP6_P_1 {

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

        Branch b1 = new Branch(bank_name, bank_type, branch_no, branch_city);

        System.out.println("\nBank Details: ");
        System.out.println("Bank name: " + b1.getBank_name());
        System.out.println("Bank type: " + b1.getBank_type());
        System.out.println("Branch no: " + b1.getBranch_no());
        System.out.println("Branch city: " + b1.getBranch_city());
        // TODO code application logic here
    }

}
