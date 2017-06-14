package models;

public class Marker {
    double timeInSec;
    String comment;

    public Marker(double timeInSec, String comment) {
        this.timeInSec = timeInSec;
        this.comment = comment;
    }

    public Marker() {
    }

    public double getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(double timeInSec) {
        this.timeInSec = timeInSec;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
