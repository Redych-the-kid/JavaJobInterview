import LibraryAbstractions.Library;
import MediaClasses.Book;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTests extends TestCase {

    private Library library;
    private Book book;

    @BeforeEach
    public void init(){
        this.library = new Library();
        book = new Book("A poo that took a pee", "Cartman", "trash", 300);
        library.addBook(book);
    }

    @Test
    public void testLibraryAddTest() {
        assertEquals(library.getBooks().size(), 1);
    }

    @Test
    public void testLibraryGetTest(){
        assertEquals(library.getBook(book.getName() + book.getAuthor()).getName(), book.getName());
    }

    @Test
    public void testLibraryDeleteTest(){
        library.removeBook(book.getName() + book.getAuthor());
        assertEquals(library.getBooks().size(), 0);
    }

    @Test
    public void testGetBooks(){
        var list = library.getBooks();
        assertEquals(list.get(0).getName(), book.getName());
    }
}