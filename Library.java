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





}
