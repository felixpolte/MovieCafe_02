package Java;
import java.util.ArrayList;
import java.util.Arrays;


/***
 * The functions of the media class sets the publishing date of a movie or show
 * and can add userratings to a certain movie or show
 * you can also display those information via the getter functions
 */
public class Media{

    private String publishDate;

    Media()
    {
        publishDate= "";
        float avg_Rating = 0;
    }


    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }



    public String getPublishDate() {
        return publishDate;
    }


}
