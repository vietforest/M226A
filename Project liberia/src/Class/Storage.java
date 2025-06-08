package Class;

import java.util.ArrayList;
import java.util.Objects;

public class Storage {
    private ArrayList<Book> booksList;

    public Storage() {
        this.booksList = new ArrayList<>();
    }

    public Storage(ArrayList<Book> booksList) {
        this.booksList = new ArrayList<>();
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }

    public void addBook(Book book) {
        booksList.add(book);
    }

    public void removeBook(String book) {
        Book book2 = new Book();
        for (Book book1 : booksList){
            if (book1.getTitle().equalsIgnoreCase(book) || book1.getISBN().equals(book)) {
                book2 = book1;
            }
        }
        booksList.remove(book2);
    }

    public Book searchBook(String book) {
        for (Book book1 : booksList){
            if (book1.getTitle().equalsIgnoreCase(book) || book1.getISBN().equals(book)) {
                return book1;
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(booksList, storage.booksList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(booksList);
    }
}
