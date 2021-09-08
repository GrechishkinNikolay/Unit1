package unit5.forTask3;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private String title;
    private List<Actor> actors;

    public Film(String title) {
        this.title = title;
        this.actors = new ArrayList<>();
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
