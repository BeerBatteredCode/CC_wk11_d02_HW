import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("LOTR", "Tolken", "Fantasy");
    }

    @Test
    public void checkTotalBooks() {
        assertEquals(0, library.totalBooks());
    }

    @Test
    public void checkAddBooksToStock() {
        library.addBookToStock(book);
        assertEquals(1, library.totalBooks());
    }

    @Test
    public void checkLibraryCapacityWorking() {
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        assertEquals(5, library.totalBooks());
    }

    @Test
    public void checkRemoveBook() {
        library.addBookToStock(book);
        library.removeBook();
        assertEquals(0, library.totalBooks());
    }

    @Test
    public void checkLendingPossible() {
        library.addBookToStock(book);
        assertEquals(book, library.bookLent(book));
        assertEquals(0, library.totalBooks());
    }

}
