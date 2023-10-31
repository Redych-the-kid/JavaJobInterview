package LibraryAbstractions;

import MediaClasses.Media;
import lombok.AllArgsConstructor;

import java.util.Hashtable;
import java.util.List;

@AllArgsConstructor
public class User {
    private Hashtable<String, Media> books;

    public List<Media> getBooks(){
        return books.values().stream().toList();
    }
    public User(){
        this.books = new Hashtable<>();
    }

    public void addBook(Media book){
        books.put(book.getName() + book.getAuthor(), book);
    }

    public void removeBook(String request){
        books.remove(request);
    }
}
