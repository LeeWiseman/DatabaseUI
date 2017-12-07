
package databaseui;

public class User {
    private int userID, followers, userInterestID;
    private String username, email, password;
    
    public User(){
        this.userID = 0000;
        this.followers = 0000;
        this.userInterestID = 0000;
        this.username = "noname";
        this.email = "null";
        this.password = "null";
    }
    public User(int userID, int followers, int userInterestID, String username, String email, String password) {
        this.userID = userID;
        this.followers = followers;
        this.userInterestID = userInterestID;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    //setters

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setUserInterestID(int userInterestID) {
        this.userInterestID = userInterestID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //getters

    public int getUserID() {
        return userID;
    }

    public int getFollowers() {
        return followers;
    }

    public int getUserInterestID() {
        return userInterestID;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    //toString

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", followers=" + followers + ", userInterestID=" + userInterestID + ", username=" + username + ", email=" + email + ", password=" + password + '}';
    }
    
    
   
    
    
    
}
