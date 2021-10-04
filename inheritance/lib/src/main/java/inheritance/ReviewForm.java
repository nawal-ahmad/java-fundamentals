package inheritance;

import java.util.ArrayList;
import java.util.List;

public abstract class ReviewForm implements ReviewInterface{
    public String name;
    public double stars;
    public ArrayList<Review> reviews;

    float starsSum = 0;
    public void addReview(Review review) {
        this.reviews.add(review);
        starsSum = starsSum +review.getStars();
        this.stars= Math.round(starsSum/this.reviews.size());
    }
}
