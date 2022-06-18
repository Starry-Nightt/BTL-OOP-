package main;

public class User {
    private  String userID;
    private String userName;
    private History history;

    public User (String userID, String userName){
        this.userID = userID;
        this.userName = userName;
        history = new History();
    }

    public String getUserID(){
        return userID;
    }
    public String getUserName(){
        return userName;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void viewHistory(){
        history.viewHistory();
    }

    public Result listenPodcast(Podcast podcast){
        /*
         Code

         */

        return null;
    }

}
