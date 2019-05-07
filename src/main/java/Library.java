import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
        this.stock = new ArrayList<>();
        this.capacity = 5;
    }

    public int totalBooks() {
        return this.stock.size();
    }

    public void addBookToStock(Book book) {
        if (totalBooks() < this.capacity) {
            this.stock.add(book);
        }
    }

    public void removeBook() {
        this.stock.remove(0);
    }

    public Book bookLent(Book book) {
        if (stock.remove(book)) {
            return book;
        }
        return null;
    }
}
