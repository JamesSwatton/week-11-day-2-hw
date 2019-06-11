import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("Learn Java In A Day", "God", "Fantasy");
        library.addBook(book);
    }

    @Test
    public void hasACollection(){
        assertEquals(0, borrower.totalBooks());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.totalBooks());
    }


}
