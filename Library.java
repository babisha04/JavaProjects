package LMS;

import java.util.*;

public class Library {
private ArrayList<Book> books=new ArrayList<>() ;
private HashMap<Integer, ArrayList<Book>>  issuedbooks= new HashMap<>();
public void addbook(Book book){
    books.add(book);
    System.out.println("Book Added"+book.getTitle());

}
public void removebook(int id){
    Book target=null;
    for(Book b:books){
        if(b.getid()==id){
            target=b;
            break;
        }
    }
    if(target==null){
        System.out.println("No Book Available");

    }
    if(!target.isAvailable()){
        System.out.println("Cannot Delete: Its in issued status");

    }
    books.remove(target);
    System.out.println("Book"+id+"removed successfully");
}
public void issueBook(int bookId, Student student){
    for(Book book:books){
        if(bookId==book.getid()&& book.isAvailable()){
            book.setAvailable(false);
            issuedbooks.computeIfAbsent(student,k->new ArrayList<>()).add(book);
            System.out.println("Book Issued:"+book.getTitle()+"to "+student.name);
            return; // it will simply return after done
        }}

            System.out.println("Book not Available");// if not returned it will execute

    }
    public void returnBook(int bookId,Student student) {
        List<Book> studentBooks = issuedbooks.get(student);
        if (studentBooks != null) {
            for (Book book : studentBooks) {
                if (book.getid() == bookId) {
                book.setAvailable(true);
                studentBooks.remove(book);
                System.out.println("Book returned"+book.getTitle());
                return;
                }
            }
        }
        System.out.println("This student did not issue this book.");

    }
}






