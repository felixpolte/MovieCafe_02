package Java;
import Java.Exceptions.LoginFailedException;

/***
 * The User class cointains the cunstrocter function to create empty user credentials and a
 * second user function to directly add values to those variables
 * you can also set each user variable separately via the set functions or can get them via the get functions
 */
public class User {
    private String name;
    private String email;
    private String password;
    User()
    {
        name = "";
        email = "";
        password= "";
    }
    User(String name, String email, String password){
    this.name=name;
    this.email=email;
    this.password=password;
    }
//user;D
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    /***
     * checks if email = entered email and password = entered password
     *
     * @param email input for email for the login process
     * @param password input for password fpr the login process
     * @return returns if login was successful or not
     */

    public boolean login(String email ,String password){
        if((this.email.equals(email))&&(this.password.equals(password))){
            return true;
        }
        else{
            throw new LoginFailedException("Login failed either the E-mail or password are not the correct.");
        }
    }
}