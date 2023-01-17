package JawabanNoTiga;

public class Messages {
    private String UserID;
    private String UserName;
    private String WhatYouPosts;

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

    public String getWhatYouPosts() {
        return WhatYouPosts;
    }

    public void setWhatYouPosts(String whatYouPosts) {
        WhatYouPosts = whatYouPosts;
    }

    public Messages(String userID, String userName, String whatYouPosts) {
        UserID = userID;
        UserName = userName;
        WhatYouPosts = whatYouPosts;
    }
    public Messages(){

    }
}
