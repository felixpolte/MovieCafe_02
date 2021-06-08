package Java;

import org.junit.Test;

import static org.junit.Assert.*;


public class movietest {


    @Test



    public void this_method_should_test_the_movies(){

        //add some cool shows
        Movie movie1 = new Movie("Pokemon Detective Pikachu", 104);
        Movie movie2 = new Movie("The Wolf of Wall Street", 179);
        Movie movie3 = new Movie("ProjectX", 88);
        Movie movie4 = new Movie("Aquaman", 143);
        Movie movie5 = new Movie("The Hangover", 99);



        //add genres
        movie1.addGenre("family");

        movie2.addGenre("true-based-story");
        movie2.addGenre("comedy");

        movie3.addGenre("comedy");

        movie4.addGenre("action");
        movie4.addGenre("adventure");

        movie5.addGenre("comedy");



        //add short descriptions
        movie1.setDescription("A Pokemon movie about a man and Pikachu who want to find his missing partner");
        movie2.setDescription("A movie based on the true story about Jorden Belford, a succesfull stockbroker and his descent");
        movie3.setDescription("A movie about a party, wich escalated");
        movie4.setDescription("Aquaman is a atlantic man who have to prevent a big war between the King from Atlantis and ");
        movie5.setDescription("A very funny Story about a group of 4 men they have a bachelorette party and got a hangover");




        //that give us information about a movie
        assertEquals("The Wolf of Wall Street",movie2.getTitle());
        assertEquals(179 ,movie2.getLength(), 0.0);
        assertEquals("[true-based-story, comedy]", movie2.getGenre().toString());
        assertEquals("A movie based on the true story about Jorden Belford, a succesfull stockbroker and his descent",movie2.getDescription());






    }







}
