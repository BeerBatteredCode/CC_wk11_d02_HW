import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int totalBorrowed() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book) {
        collection.add(book);
    }

    public void borrowBook(Library library, Book book) {
        Book bookRental = library.bookLent(book);
        if (bookRental != null) {
            addBookToCollection(bookRental);
        }
        return;
    }
}
