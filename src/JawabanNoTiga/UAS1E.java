package JawabanNoTiga;

import java.util.ArrayList;

public class UAS1E {
    private String UserID;
    private String UserName;
    private ArrayList<Messages>MY_MESSAGES;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<Messages> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<Messages> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public UAS1E (){

    }

    public UAS1E(String UserID, String UserName, ArrayList<Messages>MY_MESSAGES){
        this.UserID = UserID;
        this.UserName = UserName;
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public void  ShowPosts(UAS1E uas1E){
        for (Messages message : uas1E.getMY_MESSAGES()) {
            System.out.println("Your Messages Post = " +message.getWhatYouPosts());
        }
    }
}
