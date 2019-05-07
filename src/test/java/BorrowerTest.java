import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("LOTR", "Tolken", "Fantasy");
        library = new Library();
        library.addBookToStock(book);
        library.addBookToStock(book);
    }

    @Test
    public void checkCollectionTotal() {
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.totalBorrowed());
    }

    @Test
    public void checkCanBorrowBook() {
        borrower.borrowBook(library, book);
        borrower.borrowBook(library, book);
        assertEquals(0, library.totalBooks());
        assertEquals(2, borrower.totalBorrowed());
    }

}
