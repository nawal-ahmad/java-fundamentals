package inheritance;

import java.util.ArrayList;

public class Restaurant extends ReviewForm{
    private String name;
    private int stars;
    private int priceCat;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int priceCat) {
        this.name = name;
        this.priceCat = priceCat;
        this.reviews = new ArrayList<Review>();
    }

    @Override
    public String toString() {
        String dollar = "";
        for (int i = 1; i < priceCat; i++) {
            dollar += "$";
        }

        return "Restaurant{" +
                "Name='" + name + '\'' +
                ",Rate of stars=" + stars +
                ",Prices Category=" + dollar + "$" +
                ", reviewsList=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public float getStarsSum() {
        return starsSum;
    }

    public void setStarsSum(int starsSum) {
        this.starsSum = starsSum;
    }
}