package LMS;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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





}
