package MediaClasses;

import lombok.Getter;
import lombok.Setter;

public class Book extends Media{

    public Book(String name, String author, String genre, int pageCount) {
        super(name, author, genre);
        this.pageCount = pageCount;
    }

    @Getter
    @Setter
    private int pageCount;
}
