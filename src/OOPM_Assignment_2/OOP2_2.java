/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_2;

/**
 *
 * @author DHRUVI
 */

/*
Assignment - 2

C.Now set all data members as default and repeat the 
process of calling all the methods and noting down the issue.
*/

/*
Issues with setting data members as default access:

    Accessibility: Default access members are accessible within the same package 
                   but not from other packages. If you want to access these members 
                   from outside the package, you will encounter compilation errors.

    Encapsulation: Although default access is more restrictive than public access, 
                   it still exposes the internal state of the class to other classes 
                   within the same package. This can lead to potential misuse and 
                   violation of encapsulation.

    Maintainability: If you have multiple classes accessing the default access members, 
                     it becomes difficult to maintain and refactor the code. Any changes 
                     to the internal structure or implementation of the class may affect 
                     other classes that rely on the default access members.

    Testability: Default access can make it challenging to write unit tests for the class, 
                 as the tests need to be in the same package to access the default access members.
*/

class Book_master {

    String Publisher, Author, Title;
     int ISBN, No_of_Pages, Price, Stock_in_hand;

    void IssueBook(int No_of_copies) {
        if (Stock_in_hand >= No_of_copies) {
            Stock_in_hand -= No_of_copies;
            System.out.println(No_of_copies + " copies of the book '" + Title + "' have been issued.");
        } else {
            System.out.println("Insufficient stock. Only " + Stock_in_hand + " copies available.");
        }
    }

    void ReturnBook(int No_of_copies) {
        Stock_in_hand += No_of_copies;
        System.out.println(No_of_copies + " copies of the book '" + Title + "' have been Returned.");

    }

    void ShowBookDetails() {
        System.out.println(" ISBN : " + ISBN + "\n Publisher : " + Publisher + "\n Author : " + Author
                + " \n Title : " + Title + "\n No_of_Pages : " + No_of_Pages + "\n Price : " + Price
                + " \n Stock_in_hand : " + Stock_in_hand);
    }

}

public class OOP2_2 {

    public static void main(String[] args) {
        Book_master obj = new Book_master();

        obj.ISBN = 978 - 3 - 16 - 148410 - 0;
        obj.Publisher = "Penguin Random House";
        obj.Author = "John Doe";
        obj.Title = "The Wonderful World of Books";
        obj.No_of_Pages = 950;
        obj.Price = -550; //Set price as negative number
        obj.Stock_in_hand = -4; //Set Stock_in_hand as negative number

        obj.ShowBookDetails();

        System.out.println("");

        obj.IssueBook(3);
        obj.ShowBookDetails();

        System.out.println("");

        obj.ReturnBook(2);
        obj.ShowBookDetails();

        // TODO code application logic here
    }

}
