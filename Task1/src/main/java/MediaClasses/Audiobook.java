package MediaClasses;

import lombok.Getter;
import lombok.Setter;

public class Audiobook extends Media{
    @Getter
    @Setter
    private int duration;

    public Audiobook(String name, String author, String genre, int duration) {
        super(name, author, genre);
        this.duration = duration;
    }
}
