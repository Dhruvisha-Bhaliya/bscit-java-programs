/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPM_Assignment_7;

/**
 *
 * @author DHRUVI
 */

/*
Practical Assignment7
Aim: Implement Hierachical Inheritance in java with constructor
 */
class Emp {

    protected String Empname;
    protected int Empid;
    protected String designation;

    public Emp(String Empname, int Empid, String designation) {
        this.Empname = Empname;
        this.Empid = Empid;
        this.designation = designation;
    }

}

class payroll extends Emp {

    protected double Basic_salary;
    protected double DA;
    protected double Net_salary;

    public payroll(String Empname, int Empid, String designation, double Basic_salary) {
        super(Empname, Empid, designation);
        this.Basic_salary = Basic_salary;

        if (designation.equalsIgnoreCase("Manager")) {
            DA = 0.6 * Basic_salary;
        } else {
            DA = 0.4 * Basic_salary;
        }
        Net_salary = Basic_salary + DA;

    }

    public void show() {
        System.out.println("Employee name: " + Empname);
        System.out.println("Designation: " + designation);
        System.out.println("netsalary: " + Net_salary);
    }
}

class Project extends Emp {

    protected String Project_title;

    public Project(String Empname, int Empid, String designation, String Project_title) {
        super(Empname, Empid, designation);
        this.Project_title = Project_title;
    }

    public void display() {
        System.out.println("Employee name: " + Empname);
        System.out.println("Project Title: " + Project_title);
    }
}

public class OOP7_1 {

    public static void main(String[] args) {
        payroll p1 = new payroll("Dhruvi", 1, "Manager", 5000);
        p1.show();

        Project p2 = new Project("shweta", 2, "Professor", "project X");
        p2.display();
        // TODO code application logic here
    }

}
