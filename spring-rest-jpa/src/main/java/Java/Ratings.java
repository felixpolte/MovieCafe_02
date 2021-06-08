package Java;

import Java.Exceptions.WrongRatingException;

/***
 * The Ratings class is there to set create a user rating
 * and/or change certain information of the rating
 * you can also display specific infos of the user rating via the getter function
 */
public class Ratings {
    private double rating;
    private String comment;
    private int ID;
    private String Media;

    Ratings(String Media, double rating, String comment, int ID) {
        this.Media = Media;
        this.rating = rating;
        this.comment = comment;
        this.ID = ID;
    }


    public void setRating(double rating)
    {
        if(rating <=5 && rating >=1){
            this.rating = rating;
        }
        else
            {
                throw new WrongRatingException("Rating must be a number between 1 and 5");
            }

    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setMedia(String media) {
        Media = media;
    }

    public double getRating() {
        return rating;
    }
    public String getMedia() {
        return Media;
    }
    public String getComment() { return comment; }
    public int getID() { return ID; }
}

