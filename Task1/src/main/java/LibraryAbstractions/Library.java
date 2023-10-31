package LibraryAbstractions;

import MediaClasses.Media;
import lombok.AllArgsConstructor;

import java.util.Hashtable;
import java.util.List;

@AllArgsConstructor
public class Library {
    private Hashtable<String, Media> books;

    public List<Media> getBooks(){
        return books.values().stream().toList();
    }
    public Library(){
        this.books = new Hashtable<>();
    }
    public void addBook(Media book){
        books.put(book.getName() + book.getAuthor(), book);
    }

    public Media getBook(String request){
        return books.get(request);
    }

    public void removeBook(String request){
        books.remove(request);
    }
}
