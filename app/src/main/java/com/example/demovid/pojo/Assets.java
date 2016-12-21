package com.example.demovid.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Assets {

    @SerializedName("videos")
    @Expose
    private Videos videos;
    @SerializedName("thumbnails")
    @Expose
    private List<Object> thumbnails = null;
    @SerializedName("poster_frames")
    @Expose
    private List<Object> posterFrames = null;

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    public List<Object> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<Object> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public List<Object> getPosterFrames() {
        return posterFrames;
    }

    public void setPosterFrames(List<Object> posterFrames) {
        this.posterFrames = posterFrames;
    }

}