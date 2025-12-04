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
3. Also implement a parameterized constructor to initialize all the data member of class.
*/

class Book_Master {
    int ISBN,No_of_Pages,Price,Stock_in_hand;
    String Title,Author,Publisher;
    
   public void ShowBookDetails(){
        System.out.print(
                        "\nISBN : "+ISBN+
                        "\nPrice : "+Price+
                        "\nNo_of_Pages : "+No_of_Pages+
                        "\nStock_in_Hand : "+Stock_in_hand+
                        "\nTitle : "+Title+
                        "\nAuthor : "+Author+
                        "\nPublisher : "+Publisher);
    }

    public Book_Master() {
       Stock_in_hand = 10;
    }

    public Book_Master(int S) {
        this.Stock_in_hand = S;
    }

    public Book_Master(int I, int No, int P, int Sto, String T, String Au, String pub) {
        ISBN = I;
        No_of_Pages = No;
        Price = P;
        Stock_in_hand = Sto;
        Title = T;
        Author = Au;
        Publisher = pub;
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
}

public class OOP3_3 {

    public static void main(String[] args) {
          Book_Master obj1=new Book_Master(); 
       Book_Master obj2=new Book_Master(20); 
       Book_Master obj3=new Book_Master(202,34,56,30,"xyz","doctor","red");
        System.out.println("stock is:"+obj1.Stock_in_hand);
      System.out.println("stock is:"+obj2.Stock_in_hand);
        System.out.print(obj3.ISBN);
        System.out.print(" "+obj3.No_of_Pages);
        System.out.print(" "+obj3.Price);
        System.out.print(" "+obj3.Stock_in_hand);
        System.out.print(" "+obj3.Title);
        System.out.print(" "+obj3.Author);
        System.out.print(" "+obj3.Publisher);
       

      Book_Master B1 = new Book_Master(); 
       
       B1.ISBN=101;
       B1.Price=150;
       B1.No_of_Pages=200;
       B1.Stock_in_hand=10;
       B1.Title="Visualization";
       B1.Author="S.Joshi";
       B1.Publisher="Aashi";
       
       B1.ShowBookDetails();
       System.out.println();

       B1.IssueBook(3);
       System.out.println();
       B1.ShowBookDetails();
       System.out.println();

       B1.ReturnBook(2);
       System.out.println();
       B1.ShowBookDetails();    
    }
}
