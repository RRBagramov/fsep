package models;

public class Video {
    private int id;
    private Session session;
    private String url;

    public Video() {
    }

    public Video(int id, Session session, String url) {
        this.id = id;
        this.session = session;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
