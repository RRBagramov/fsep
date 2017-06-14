package models;

public class Comment {
    private Video video;
    private String text;
    private String commentAddTime;
    private String commentAddDate;

    public Comment() {
    }

    public Comment(Video video, String text, String commentAddTime, String commentAddDate) {
        this.video = video;
        this.text = text;
        this.commentAddTime = commentAddTime;
        this.commentAddDate = commentAddDate;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCommentAddTime() {
        return commentAddTime;
    }

    public void setCommentAddTime(String commentAddTime) {
        this.commentAddTime = commentAddTime;
    }

    public String getCommentAddDate() {
        return commentAddDate;
    }

    public void setCommentAddDate(String commentAddDate) {
        this.commentAddDate = commentAddDate;
    }
}
