import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Noob Coding", "Me", "Self Help");
    }

    @Test
    public void hasATitle(){
        assertEquals("Noob Coding", book.getTitle());
    }

    @Test
    public void hasAnAuthor(){
        assertEquals("Me", book.getAuthor());
    }

    @Test
    public void hasAGenre(){
        assertEquals("Self Help", book.getGenre());
    }
}
