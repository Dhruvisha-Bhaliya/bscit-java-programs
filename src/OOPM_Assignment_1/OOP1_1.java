/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_1;

/**
 *
 * @author DHRUVI
 */

/*
A.	Consider you are developing an e-Library Management System. Create an 
application named “Book_transact”. In that application, create a class “Book_Master” 
containing members as below

Data member – ISBN, Publisher, Author, Title, No_of_Pages, Price, Stock_in_Hand
Member function – 

1.	ShowBookDetails() – This will print all the details of a book
“Book_transact”contains main method. Call the members of class “Book_Master” from here. 
First set the values of all variables of class using an object (obj.ISBN= “xxx”). 
Then call the method ShowBookDetails() for example, obj.ShowBookDetails().

 */
//----------------------------------------------------------------------------------------------------
/*
B.	In class “Book_Master”, create two more methods
1.	IssueBook (int no_of_copies) 
2.	ReturnBook (int no_of_copies) 
 When issueBook method is called, the method should subtract the value of no_of_copies from Stock_in_Hand.
Eg: consider Book1 having value for stock_in_hand = 12.
When you call issueBook(3), now the value of stock_in_hand should be 9 i.e. 12-3;
Similarly calling retunBook() should add the no_of_copies to stock_in_hand

Note: Set all the values of variables from main method and then Record the results by calling
Obj.ShowBookDetails()
Obj.IssueBook(3)
Obj.ShowBookDetails()
Obj.returnBook(2)
Obj.ShowBookDetails()

 */
class Book_Master {

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

public class OOP1_1 {

    public static void main(String[] args) {
        Book_Master obj = new Book_Master();

        obj.ISBN = 978 - 3 - 16 - 148410 - 0;
        obj.Publisher = "Penguin Random House";
        obj.Author = "John Doe";
        obj.Title = "The Wonderful World of Books";
        obj.No_of_Pages = 950;
        obj.Price = 550;
        obj.Stock_in_hand = 4;

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
