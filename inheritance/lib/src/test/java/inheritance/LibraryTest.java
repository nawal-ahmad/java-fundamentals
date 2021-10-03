/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void restaurantTesting(){
        Restaurant BurgerMaker = new Restaurant("BurgerMaker",5);
        assertNotNull(BurgerMaker,"ensure that Restaurant class work properly");
        assertEquals(5,BurgerMaker.getPriceCat());
    }
    @Test
    void reviewsTesting() {
        Restaurant res1 = new Restaurant("res1", 5);
        Review rev1=new Review("Ahmad", "Perfect",5);
        Review rev2=new Review("Sam", "bad",1);
        res1.addReview(rev1);
        res1.addReview(rev2);
        assertEquals(rev1.getAuthor(),"Ahmad");
        assertEquals(res1.getStars(),3);

        Restaurant res2 = new Restaurant("res2", 3);
        Review rev3=new Review("Nahla", "worst",1);
        Review rev4=new Review("Hana", "bad",1);
        res2.addReview(rev3);
        res2.addReview(rev4);
        assertEquals(rev3.getAuthor(),"Nahla");
        assertEquals(res2.getStars(),1);

    }
}