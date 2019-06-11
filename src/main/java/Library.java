import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int totalBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (totalBooks() < capacity) {
            this.books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book removeBook() {
        return this.books.remove(0);
    }


    public int numOfBooksByGenre(String genre) {
        String genreToSearch = genre;
        HashMap<String, Integer> numOfBooksByGenre;
        numOfBooksByGenre = new HashMap<String, Integer>();

        for (Book book : this.books){
            if (numOfBooksByGenre.containsKey(genreToSearch)) {
                int runningTotal = numOfBooksByGenre.get(genreToSearch);
                numOfBooksByGenre.replace(genreToSearch, runningTotal+1 );
            } else {
                numOfBooksByGenre.put(book.getGenre(), 1);
            }
        }

        return numOfBooksByGenre.get(genreToSearch);
    }
}
