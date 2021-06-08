package Java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class showtest {


    @Test

    public void this_method_implements_some_cool_shows() {


        Show Show1 = new Show(18, 2, "Paradise PD");
        Show Show2 = new Show(24, 3, "Elite");
        Show Show3 = new Show(8, 1, "The Witcher");
        Show Show4 = new Show(12, 2, "How to sell Drugs online (fast)");
        Show Show5 = new Show(25, 2, "Stranger Things");

        //This implements the time in minutes for every episode
        double[] lengths1 = {29, 27, 27, 28, 28, 27, 28, 27, 27, 28, 28, 26, 26, 28, 26, 26,29,27};
        Show1.setEpisodesLength(lengths1);

        double[] lengths2 = {56,49, 53,47,48,49,46,51, 52, 47, 53, 49, 49, 47, 52, 50, 48, 49, 47, 52, 52, 50, 46, 51};
        Show2.setEpisodesLength(lengths2);

        double[] lengths3 = {61,60,67,62,59,59,59,47,59};
        Show3.setEpisodesLength(lengths3);

        double[] lengths4 = {32,30,28,28,24,29, 35,34,32,34,29};
        Show4.setEpisodesLength(lengths4);

        double[] lengths5 = {48,55,52,50,53,47,42,55,48,56,51,46,58,51,45,47,62, 50,49,52,52,59,55,77};
        Show5.setEpisodesLength(lengths5);

        //this implements the genre for the show
        Show1.addGenre("family");
        Show1.addGenre("true-based-story");
        Show2.addGenre("comedy");
        Show3.addGenre("comedy");
        Show4.addGenre("action");
        Show4.addGenre("adventure");
        Show5.addGenre("comedy");


        //implements a description
        Show1.setDescription("This is a very funny show about a police department in a city");

        Show2.setDescription("*add later");

        Show3.setDescription("*add later");

        Show4.setDescription("*add later");

        Show5.setDescription("*add later");


        //Tests

        assertEquals("This is a very funny show about a police department in a city" ,Show1.getDescription());
        assertEquals("[family, true-based-story]",Show1.getGenre().toString());
        assertEquals("Paradise PD",Show1.getTitle());
        assertEquals(27.3, Show1.avgEpisodeLength(), 0.1);





    }


}



