/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPM_Assignment_3;

/**
 *
 * @author DHRUVI
 */

/*
With reference to assignment1, implement default constructor and parameterized constructor. 

1.If no value is passed in parameter at the time of object creation, 
the stock_in_Hand must be initialised to 10. 
*/
class Book_master {

    String Publisher, Author, Title;
     int ISBN, No_of_Pages, Price, Stock_in_hand;

     //Parameter constructor
    public Book_master(String Publisher, String Author, String Title, int ISBN, int No_of_Pages, int Price, int Stock_in_hand) {
        this.Publisher = Publisher;
        this.Author = Author;
        this.Title = Title;
        this.ISBN = ISBN;
        this.No_of_Pages = No_of_Pages;
        this.Price = Price;
        this.Stock_in_hand = Stock_in_hand;
    }

    //default constructor
    public Book_master() {
        Stock_in_hand = 10;
    }
  
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
public class OOP3_1 {

    public static void main(String[] args) {
         Book_master obj = new Book_master();
         obj.ShowBookDetails();
         System.out.println("");

         
         Book_master obj1 = new Book_master("Penguin Random House",
                 "John Doe","The Wonderful World of Books",978 - 3 - 16 - 148410 - 0,950,550,3);
       
       
        obj1.ShowBookDetails();

        System.out.println("");

        obj1.IssueBook(3);
        obj1.ShowBookDetails();

        System.out.println("");

        obj1.ReturnBook(2);
        obj1.ShowBookDetails();

        // TODO code application logic here
    }

}
   
