

package Java;
import java.util.ArrayList;
import Java.Exceptions.NoRatingException;
import Java.Exceptions.fillUserFailException;

/***
 * This class exists to manage the interaction between the Users and the Ratings, it also manges the more dynamic parts of the Data.
 */

public class UserRatings {
private int currentUser;
private int RatingID;
ArrayList <User> users = new ArrayList<User>();
ArrayList <Ratings> ratings = new ArrayList<Ratings>();

UserRatings(){
    currentUser=1;
    RatingID=1;

}

    public ArrayList<Ratings> getRatings() {
        return ratings;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setRatings(ArrayList<Ratings> ratings) {
        this.ratings = ratings;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    /***
     * Method to get a specific User from the Array of Users
     *
     * @param Index Index of requested User in Array
     * @return returns User as a Method
     */

    public User getUserbyIndex(int Index){
        return users.get(Index);
    }

    /***
     * Method to get a specific Rating from the Array of Ratings
     *
     * @param Index Index of requested Ratings in Array
     * @return returns specific Rating as a Method
     */

    public Ratings getRatingbyIndex (int Index){
        return  ratings.get(Index);
    }


    /***
     *  This Method is to generate a given number of empty Users. witch will later be filled by fillUser
     * @param usernumber descripes number of users that need to be generated
     *
     */
    public void newUsers(int usernumber){
        for(int i=0; i<usernumber; i++){
            users.add(new User());
        }
    }

    /***
     *This Method fills the User with given Data it Returns a Counter (ID) for easy acsess to a given User in the Array
     *
     * @param name defines the name that is to be input in the User that is to be filled in this Method
     * @param email defines the email that is to be input in the User that is to be filled in this Method
     * @param password defines the password that is to be input in the User that is to be filled in this Method
     * @return returns the UserID with which the access to this exact filled User in the array of Users is possible
     */
    public int fillUser(String name, String email, String password){
        int UserID=0;
        User write = new User(name, email, password);
        users.set(currentUser, write);
        if((write.getEmail().equals(email))&&(write.getName().equals(name))&&(write.getPassword().equals(password))){
            UserID= currentUser;
            currentUser=currentUser+1;
            return UserID;
        }
        else{
            throw new fillUserFailException("failed to write Data into the User Array.");
        }
    }

    public void writeSessionUsers(){
        //Method for Database connection writes current sessions Users in Database
    }

    public void ReadSessionUsers(){
        //Method for Database connection reads Users from Database on Program startup
    }

    /***
     * This Method uses the simple Login function from User to verify the Login of the User which then saves the given Review Data in
     * the Reviews Array it also ups the counter of the RatingID by 1.
     *
     * @param UserID  defines which User reviews the given Media.
     * @param email   part of the login details which are required to write a review
     * @param password part of the login details which are required to write a review
     * @param Media     defines the Media(Title) on which the review is based on
     * @param comment   defines the comment of the review
     * @param Rating    defines the rating of the review
     */
    public void newRating(int UserID, String email, String password, String Media, String comment, double Rating){
        Ratings write = new Ratings(Media, Rating, comment, RatingID);
        if(users.get(UserID).login(email, password)){
            ratings.add(write);
            RatingID=RatingID+1;
       }
    }

    /***
     * This Method outputs a average Rating for a given Media which is filtered by its Title and pulled form the array of all Ratings**.
     *
     * @param filter gives basic known Rating as a filter for a rated Media
     * @param rating inputs the Array of all ratings
     * @return returns the average Rating for a given Media
     */
    public Double getAvg_Rating(Ratings filter, ArrayList <Ratings> rating) {
        if(filter.getMedia().equals(rating.get(filter.getID()).getMedia())) {
            double sum = 0.0;//adds all ratings and divides them by the amount of ratings
            for (int i = 0; i < ratings.size(); i++) {
                sum = sum + ratings.get(i).getRating();
            }
            return sum / ratings.size();
        }
        else{
            throw new NoRatingException("The requested Media"+ filter.getMedia() + "is not yet rated.");
        }
    }



}
