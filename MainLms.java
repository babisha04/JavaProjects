package LMS;

import java.util.Scanner;

public class MainLms {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Student s1 = new Student(1, "Alice", "cs002");
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Display All Books");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addbook(new Book(id, title, author));
                }
                case 2 -> {
                    System.out.print("Enter book id to remove: ");
                    int id = sc.nextInt();
                    library.removebook(id);
                }
                case 3 -> {
                    System.out.print("Enter book id to issue: ");
                    int id = sc.nextInt();
                    library.issueBook(id, s1);
                }
                case 4 -> {
                    System.out.print("Enter book id to return: ");
                    int id = sc.nextInt();
                    library.returnBook(id, s1);
                }
                case 5 -> {
                    sc.nextLine();
                    System.out.print("Enter book title to search: ");
                    String title = sc.nextLine();
                    library.searchBook(title);
                }
                case 6 -> library.displayBook();
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}