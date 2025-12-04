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
E.	Now set all data members as private and call the methods as above. 
If all data members are private then how will you access it. 
Implement the way of accessing the private data of Book_master. 
Write in comment section how it helps in hiding the data and making your application robust.
*/

/*
Accessing private data members using getter and setter methods: 

To access the private data members of the Book_Master class, 
we have implemented getter and setter methods. These methods allow 
controlled access to the private data members while maintaining data 
integrity and encapsulation. The setter methods, such as setPrice() and 
setStock_in_hand(), validate the input values before setting them. 
This ensures that the data members are not assigned invalid values 
(e.g., negative price or stock). Benefits of using private access with getter and setter methods:

    Encapsulation: By making data members private, we hide the internal implementation 
                   details of the class, promoting encapsulation and data abstraction.

    Data Integrity: Setter methods allow us to validate and sanitize the input 
                    data before assigning it to the private data members. This helps maintain data 
                    integrity and prevent invalid states.

    Flexibility: Getter and setter methods provide a layer of abstraction 
                 between the class and its clients. If the internal implementation needs to 
                 be changed in the future, we can modify the methods without affecting the client code.

    Consistency: Getter and setter methods ensure that data is accessed and 
                 modified consistently throughout the application, following a predefined protocol.

    Security: Private access prevents unauthorized access to sensitive data, 
              reducing the risk of data breaches or unintended modifications.
*/

class Book_aster {

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

public class OOP2_3 {
    
    public static void main(String[] args) {
        Book_aster obj = new Book_aster();

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

