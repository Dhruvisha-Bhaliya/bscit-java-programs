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

A. With reference to assignment1, Set the scope of all data members(variables) of 
class Book_master as public. Try to set the values of price and and stock_in_hand as any 
negative number from Book_transact class.

Now call the methods in same sequence as in assignment1.
Obj.ShowBookDetails()
Obj.IssueBook(3)
Obj.ShowBookDetails()
Obj.returnBook(2)
Obj.ShowBookDetails()

B. Write down the issue of setting data members as public in comment section of java file.

*/

/**
 * Issues with setting data members as public:
 * 
 * 1. Loss of Encapsulation: By declaring data members as public, the internal state of the 
 * Book_Master class is exposed, violating the principle of encapsulation.
 * 
 * 2. Lack of Data Integrity: Making data members public allows direct access and modification, 
 * leading to potential inconsistencies and invalid data states.
 * 
 * 3. Tight Coupling: Public data members increase coupling between classes, making it 
 * harder to maintain and evolve the codebase without affecting other parts of the program.
 * 
 * 4. Security Risks: Exposing sensitive data like Price and Stock_in_hand publicly can 
 * pose security risks, as unauthorized access or modification becomes easier.
 * 
 * It is recommended to keep data members private and provide controlled access through 
 * getter and setter methods to maintain encapsulation, data integrity, and flexibility in the codebase.
 */


class Book_Master {

   public String Publisher, Author, Title;
    public int ISBN, No_of_Pages, Price, Stock_in_hand;

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

public class OOP2_1 {

    public static void main(String[] args) {
        Book_Master obj = new Book_Master();

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


 
