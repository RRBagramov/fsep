package models;

public class Marker {
    private int id;
    private double startingSecond;
    private Comment comment;

    public Marker() {
    }

    public Marker(int id, double startingSecond, Comment comment) {
        this.id = id;
        this.startingSecond = startingSecond;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStartingSecond() {
        return startingSecond;
    }

    public void setStartingSecond(double startingSecond) {
        this.startingSecond = startingSecond;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
