package Interface;
import Class.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UI {
    int menuCase = 0;
    boolean flag = true;
    Storage storage = new Storage();
    Scanner input = new Scanner(System.in);
    public UI(){
        // Creating authors
        Author author1 = new Author("George","Orwell", "George Orwell");
        Author author2 = new Author("Harper" ,"Lee", "Harper Lee");

        // Creating publishers
        Publisher publisher1 = new Publisher("Penguin Books", "Second edition");
        Publisher publisher2 = new Publisher("J.B. Lippincott & Co.", "First edition");

        // Creating books
        Book book1 = new Book("1984", "978-0-452-28423-4", author1, publisher1, "Dystopian", 5);
        Book book2 = new Book("To Kill a Mockingbird", "978-0-06-112008-4", author2, publisher2, "Classic Fiction", 8);

        // Creating authors
        Author author3 = new Author("J.R.R.", "Tolkien", "J.R.R. Tolkien");
        Author author4 = new Author("Agatha", "Christie", "Agatha Christie");

// Creating publishers
        Publisher publisher3 = new Publisher("HarperCollins", "Third edition");
        Publisher publisher4 = new Publisher("William Collins Sons & Co.", "First edition");

// Creating books
        Book book3 = new Book("The Lord of the Rings", "978-0-261-10238-5", author3, publisher3, "Fantasy", 10);
        Book book4 = new Book("Murder on the Orient Express", "978-0-00-711931-8", author4, publisher4, "Mystery", 7);

        storage.addBook(book1);
        storage.addBook(book2);
        storage.addBook(book3);
        storage.addBook(book4);
        while (flag) {
            Start();
        }
    }

    public void Start(){
        switch (menuCase) {
            case 0:
                Option0();
                break;
            case 1:
                Option1();
                menuCase = 0;
                break;
            case 2:
                Option2();
                menuCase = 0;
                break;
            case 3:
                Option3();
                menuCase = 0;
                break;
            case 4:
                Option4();
                menuCase = 0;
                break;
            case 5:
                Option5();
                menuCase = 0;
                break;
            case 6:
                Option6();
                menuCase = 0;
                break;
            case 7:
                Option7();
                menuCase = 0;
                break;
            case 8:
                System.out.println("Goodbye, to the next time");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Returning to menu.");
                menuCase = 0;
        }
    }

    public void Option0(){
        System.out.printf("--------------------------------%n");
        System.out.printf("Library         %n");
        System.out.printf("1: View the list %n");
        System.out.printf("2: Search the book %n");
        System.out.printf("3: Add book %n");
        System.out.printf("4: Remove book %n");
        System.out.printf("5: Update quantity of books %n");
        System.out.printf("6: Modify information of the book %n");
        System.out.printf("7: Import CSV file %n");
        System.out.printf("8: Exit %n");
        System.out.printf("Please, enter your options: ");
        if (input.hasNextInt()) {
            menuCase = input.nextInt();
        }
        else {
            System.out.println("Invalid option. Returning to menu.");
            input.nextLine(); // Clear invalid input
        }
        if (menuCase < 9 && menuCase > 0){
            System.out.printf("--------------------------------%n");
        }
        else {
            System.out.println("Please enter valid option");
            System.out.printf("--------------------------------%n");
        }
    }

    public void Option1(){
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-40s | %-40s | %-40s | %-40s | %-20s | %-4s | %n", "Title", "ISBN", "Author", "Publisher", "Genre", "Quantity");
        for (Book book : storage.getBooksList()){
            System.out.printf("| %-40s | %-40s | %-40s | %-40s | %-20s | %-8s | %n", book.getTitle(), book.getISBN(), book.getAuthor().getPseudonym(), book.getPublisher().getName(), book.getGenre(), book.getQuantity());
        }
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");

    }

    public void Option2(){
        System.out.println("Please enter the book title or its ISBN: ");
        input.nextLine(); // consume the leftover newline
        String bookTitle = input.nextLine();
        System.out.println(storage.searchBook(bookTitle));
    }

    public void Option3(){
        System.out.println("Please add the information the right order and separate parameters by the semicolon: ");
        System.out.println("book title, ISBN, author name, author surname, author pseudonym (optional), publisher name, edition, genre, quantity");
        input.nextLine();
        String[] newBook = input.nextLine().split(";");
        if (newBook.length < 7){
            Option0();
        }
        else {
            String bookTitle = newBook[0];
            String ISBN = newBook[1];
            String authorName = newBook[2];
            String authorSurname = newBook[3];
            String authorPseudonym = newBook[4];
            String publisherName = newBook[5];
            String publisherEdition = newBook[6];
            String genre = newBook[7];
            int quantity;
            try {

                quantity = Integer.parseInt(newBook[8].replaceAll(" ", ""));

            } catch (NumberFormatException e) {
                System.out.println("Invalid number format for quantity.");
                return;
            }
            Author newAuthor = new Author(authorName, authorSurname, authorPseudonym);
            Publisher newPublisher = new Publisher(publisherName, publisherEdition);
            Book book = new Book(bookTitle, ISBN, newAuthor, newPublisher, genre, quantity);
            storage.addBook(book);
        }
    }

    public void Option4(){
        System.out.println("Please enter the book title or its ISBN: ");
        input.nextLine(); // consume the leftover newline
        String bookTitle = input.nextLine();
        storage.removeBook(bookTitle);
    }

    public void Option5(){
        System.out.println("Please enter the book title or its ISBN: ");
        input.nextLine(); // consume the leftover newline
        String bookTitle = input.nextLine();
        Book book = storage.searchBook(bookTitle);
        System.out.println("Please enter total sum of book: ");
        int bookQuantity = input.nextInt();
        book.setQuantity(bookQuantity);
    }

    public void Option6(){
        System.out.println("Please enter the book title or its ISBN: ");
        input.nextLine(); // consume the leftover newline
        String bookTitle = input.nextLine();
        Book book = storage.searchBook(bookTitle);
        System.out.println(storage.searchBook(bookTitle));
        System.out.println("Please enter what to change: ");
        String change = input.nextLine();
        if (change.equals("title")){
            book.setTitle(input.nextLine());
        }
        else if (change.equals("isbn")){
            book.setISBN(input.nextLine());
        }
        else if (change.equals("author name")){
            book.getAuthor().setName(input.nextLine());
            book.getAuthor().setPseudonym(book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        }
        else if (change.equals("author surname")){
            book.getAuthor().setSurname(input.nextLine());
            book.getAuthor().setPseudonym(book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        }
        else if (change.equals("author pseudonym")){
            book.getAuthor().setPseudonym(input.nextLine());
        }
        else if (change.equals("publisher name")){
            book.getPublisher().setName(input.nextLine());
        }
        else if (change.equals("edition")){
            book.getPublisher().setEdizione(input.nextLine());
        }
        else if (change.equals("genre")){
            book.setGenre(input.nextLine());
        }
        else if (change.equals("quantity")){
            book.setQuantity(input.nextInt());
        }
    }
    public void Option7(){
        System.out.print("Enter file path: ");
        input.nextLine();
        String filePath = input.nextLine(); // Trim unnecessary spaces
        File file = new File(filePath);
        if (Files.exists(Path.of(filePath))) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        try {
            List<String> newBook = Files.readAllLines(file.toPath());
            for (String bookTitle : newBook){
                String bookTitle1 = bookTitle.split(";")[0];
                String ISBN = bookTitle.split(";")[1];
                String authorName = bookTitle.split(";")[2];
                String authorSurname = bookTitle.split(";")[3];
                String authorPseudonym = bookTitle.split(";")[4];
                String publisherName = bookTitle.split(";")[5];
                String publisherEdition = bookTitle.split(";")[6];
                String genre = bookTitle.split(";")[7];
                int quantity;
                try {
                    quantity = Integer.parseInt(bookTitle.split(";")[8].replaceAll(" ", ""));

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format for quantity.");
                    return;
                }
                Author newAuthor = new Author(authorName, authorSurname, authorPseudonym);
                Publisher newPublisher = new Publisher(publisherName, publisherEdition);
                Book book = new Book(bookTitle1, ISBN, newAuthor, newPublisher, genre, quantity);
                storage.addBook(book);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
