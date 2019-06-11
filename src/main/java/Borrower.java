import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int totalBooks(){
        return this.collection.size();
    }


    public void borrowBook(Library library) {
        Book removedBook = library.removeBook();
        this.collection.add(removedBook);
    }
}
