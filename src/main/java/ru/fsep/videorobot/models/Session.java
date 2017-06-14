package ru.fsep.videorobot.models;

import java.util.List;

public class Session {
    private int id;
    private String name;
    private String sessionStartTime;
    private String sessionStartDate;
    private List<Video> videos;

    public Session() {
    }

    public Session(int id, String name, String sessionStartTime, String sessionStartDate, List<Video> videos) {
        this.id = id;
        this.name = name;
        this.sessionStartTime = sessionStartTime;
        this.sessionStartDate = sessionStartDate;
        this.videos = videos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSessionStartTime() {
        return sessionStartTime;
    }

    public void setSessionStartTime(String sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public String getSessionStartDate() {
        return sessionStartDate;
    }

    public void setSessionStartDate(String sessionStartDate) {
        this.sessionStartDate = sessionStartDate;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
