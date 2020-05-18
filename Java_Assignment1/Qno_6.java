/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author Ankur
 */
class Book{
    String bookName;
    String ISBN;
    String author;
    float price;
    Book(String a,String b,String c,float d){
        bookName=a;
        ISBN=b;
        author=c;
        price=d;
    }
    
}
public class Q6 {
    public static void main(String[] args) {
        Book b=new Book("Name","123","Author", (float) 12.5);
        System.out.println(b.bookName);
        System.out.println(b.ISBN);
        System.out.println(b.author);
        System.out.println(b.price);
    }
}
