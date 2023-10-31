import LibraryAbstractions.User;
import MediaClasses.Book;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTests extends TestCase {

    private User user;
    private Book book;

    @BeforeEach
    public void init(){
        this.user = new User();
        book = new Book("A poo that took a pee", "Cartman", "trash", 300);
        user.addBook(book);
    }
    @Test
    public void testUserAdd(){
        assertEquals(user.getBooks().size(), 1);
    }

    @Test
    public void testUserRemove(){
        user.removeBook(book.getName() + book.getAuthor());
        assertEquals(user.getBooks().size(), 0);
    }
    @Test
    public void testUserGetBooks(){
        var list = user.getBooks();
        assertEquals(book.getName(), list.get(0).getName());
    }
}
