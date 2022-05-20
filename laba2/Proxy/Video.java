package org.example.laba.laba2.Proxy;

public class Video {

    public final String id;
    public final String title;
    public final String data;

    public Video(
            String id,
            String title
    ) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }

}