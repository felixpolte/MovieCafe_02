package Java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserRatingsTest {
    UserRatings testing = new UserRatings();
    @Test
    public void testfillUser(){
        testing.newUsers(4);
        testing.fillUser("Hans","hans@hans.de","123456");
        testing.fillUser("Peter" , "peter@peter.de", "123456");
        testing.fillUser("Luis", "luis@luis.de","123456");
        assertEquals("Peter", testing.getUserbyIndex(2).getName());
        assertEquals("luis@luis.de", testing.getUserbyIndex(3).getEmail());
    }

    @Test
    public void testnewRating(){
        testing.newUsers(4);
        testing.fillUser("Hans","hans@hans.de","123456");
        testing.fillUser("Peter" , "peter@peter.de", "123456");
        testing.fillUser("Luis", "luis@luis.de","123456");
        testing.newRating(3,"luis@luis.de", "123456", "The Godfather", "great Movie",4.5);
        testing.newRating(1,"hans@hans.de", "123456", "The Godfather", "its ok",3);
        testing.newRating(2,"peter@peter.de","123456","The Godfather", "perfect", 5);
        assertEquals("The Godfather", testing.getRatingbyIndex(0).getMedia());
        assertEquals(4.5, testing.getRatingbyIndex(0).getRating(),0.0);
        assertEquals(4.16 , testing.getAvg_Rating(testing.getRatingbyIndex(0),testing.getRatings()), 0.1);
    }
}
