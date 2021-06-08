package Java;

import java.util.ArrayList;

/***
 * The Movie class contains functions to add the genre to movies and change
 * selected titles, lengths and descriptions of a movie
 * you can also get all these values via the get functions of the corresponding variable
 */
public class Movie{

    private String title;
    //in minutes
    private int length;

    public ArrayList<String> genre = new ArrayList<String>();
    private String description;


    Movie(String _title, int _length){
        this.title = _title;
        this.length = _length;
    }


    public void addGenre(String _genre) {
        this.genre.add(_genre);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setDescription(String description) { this.description = description; }

    public ArrayList<String> getGenre() {
        return genre;
    }
    public String getDescription() {
        return description;
    }
    public String getTitle() {
        return title;
    }
    public float getLength() {return length;}

}
