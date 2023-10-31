package MediaClasses;

import lombok.Getter;
import lombok.Setter;

public abstract class Media {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String author;

    @Getter
    @Setter
    private String genre;

    public Media(String name, String author, String genre) {
    }
}
