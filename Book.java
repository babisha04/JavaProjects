package LMS;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available=true;

    public Book(int id, String title, String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }

    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    public int getid(){
        return id;
    }
    public void setid(){
        this.id=id;
    }
    public String getTitle() {
        return title;

    }
    public void setTitle(){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author=author;
    }
    public void getdetails(){
        System.out.println("ID: "+id+"TITLE: "+title+ "AUTHOR: "+author+"AVAILABLE"+available);
    }
}
