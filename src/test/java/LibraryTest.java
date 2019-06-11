import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Learn Java In A Day", "God", "Fantasy");
        book2 = new Book("Something", "Someone", "Horror");
    }

    @Test
    public void isEmptyWhenCreated(){
        assertEquals(0, library.totalBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.totalBooks());
    }

    @Test
    public void hasACapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void cannotAddBookIfAtCapacity(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book2);
        assertEquals(4, library.totalBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.totalBooks());
    }

    @Test
    public void canCountBooksByGenre(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        HashMap bookGenreTally = library.numOfBooksByGenre();
        assertEquals(3, bookGenreTally.get("Fantasy"));
    }
}
