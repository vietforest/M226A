package Class;

import java.util.Objects;

public class Book {
    private String title;
    private String ISBN;
    private Author author;
    private Publisher publisher;
    private String genre;
    private int quantity;

    /**
     *
     */
    public  Book(){};

    /**
     *
     * @param title
     * @param ISBN
     * @param author
     * @param publisher
     * @param genre
     * @param quantity
     */
    public Book(String title, String ISBN, Author author, Publisher publisher, String genre, int quantity) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        try {
            this.quantity = quantity;
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Book: " +
                "title= '" + title + '\'' +
                ", ISBN= '" + ISBN + '\'' +
                ", author= " + author.getName() + " " + author.getSurname() +
                ", Pseudonym= " + author.getPseudonym() +
                ", publisher= " + publisher.getName() +
                ", edition= " + publisher.getEdizione() +
                ", genre= '" + genre + '\'' +
                ", quantity= " + quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return quantity == book.quantity && Objects.equals(title, book.title) && Objects.equals(ISBN, book.ISBN) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ISBN, author, publisher, genre, quantity);
    }
}
