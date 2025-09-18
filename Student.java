package LMS;

abstract class User{
    protected int id;
    protected String name;
    public User(int id, String name){
        this.id=id;
        this.name=name;
    }
    public abstract void displayInfo();
}
public class Student extends User{
    private String rollno;
    public Student(int id, String name, String rollno){
        super(id,name);
        this.rollno=rollno;
    }
    public void displayInfo(){
        System.out.println("Student "+ name + " id: "+rollno);
    }

}
