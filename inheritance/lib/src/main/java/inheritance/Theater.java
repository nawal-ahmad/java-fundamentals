package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends ReviewForm {
    private String name;
    private List<String> movies;

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<String>();
        this.reviews = new ArrayList<Review>();
    }
    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie){
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }
}

