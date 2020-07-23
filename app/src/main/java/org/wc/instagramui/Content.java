package org.wc.instagramui;

public class Content {

    private String myProfileText;
    private int myProfilePic;

    private int postPic;

    private int linkPic;

    private int commentPic;
    private String commentText;

    public Content(String myProfileText, int myProfilePic, int postPic, int linkPic, int commentPic, String commentText) {
        this.myProfileText = myProfileText;
        this.myProfilePic = myProfilePic;
        this.postPic = postPic;
        this.linkPic = linkPic;
        this.commentPic = commentPic;
        this.commentText = commentText;
    }

    public String getMyProfileText() {
        return myProfileText;
    }

    public void setMyProfileText(String myProfileText) {
        this.myProfileText = myProfileText;
    }


    public int getMyProfilePic() {
        return myProfilePic;
    }

    public void setMyProfilePic(int myProfilePic) {
        this.myProfilePic = myProfilePic;
    }

    public int getPostPic() {
        return postPic;
    }

    public void setPostPic(int postPic) {
        this.postPic = postPic;
    }

    public int getLinkPic() {
        return linkPic;
    }

    public void setLinkPic(int linkPic) {
        this.linkPic = linkPic;
    }

    public int getCommentPic() {
        return commentPic;
    }

    public void setCommentPic(int commentPic) {
        this.commentPic = commentPic;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

}
