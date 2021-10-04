package inheritance;

public class MovieReview extends Review{
    String movieShown;

    public MovieReview(String author, String body, int stars, String movieSeen) {
        super(author, body, stars);
        this.movieShown = movieShown;
    }

    @Override
    public String toString() {
        return "Review{" + "movieSeen='" + movieShown + '\'' + ", author='" + getAuthor() + '\'' + ", body='" + getBody() + '\'' + ", stars=" + getStars() + '}';
    }

}
