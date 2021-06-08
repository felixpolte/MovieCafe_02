package Java;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


/***
 * The Show class contains functions to add the genre to show and change
 * selected titles, lengths, episodes, seasons. episodenlength and descriptions of a show
 * you can also get all these values via the get functions of the corresponding variable
 * the class have a method to calculate the average episode length from a show
 */



public class Show {
    private int episodes;
    private int seasons;
    private ArrayList <String> genre = new ArrayList<String>();
    private String title;
    private double[] EpisodesLength = new double[episodes];
    private String Description;

    Show(int _episodes,int _seasons, String _title){
        this.episodes= _episodes;
        this.seasons=_seasons;
        this.title=_title;
        Arrays.fill(EpisodesLength, 0.0);
        Description="";
    }
    //Setters and Getters
    public void setDescription(String description) {
        Description = description;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setEpisodesLength(double[] episodesLength) {
        EpisodesLength = episodesLength;
    }

    public void addGenre(String _genre) {
        this.genre.add(_genre);
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public ArrayList<String> getGenre() {
        return genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public String getEpisodesLength() {
        String output= "";
        for(int i = 0; i< EpisodesLength.length; i++)
        {
            output= output+"\n"+  EpisodesLength[i];
        }
        return output;
    }

    public String getDescription() {
        return Description;
    }

    public String getTitle() {
        return title;
    }




    /***
     *This Method calculate the average episode lenght for a show
     *
     * @fullLenghth save the total length from all episodes
     * @episodenCount save the number how much episodes a show includes
     * @return divide the total minutes of all episodes by the number of all episodes and return the average length
     */

    public double avgEpisodeLength(){
        double fullLength=0;
        double episodeCount=(double) EpisodesLength.length;
        for(int x=0; x<EpisodesLength.length; x++){
            fullLength=fullLength+EpisodesLength[x];
        }
        return fullLength/episodeCount;
    }
}
