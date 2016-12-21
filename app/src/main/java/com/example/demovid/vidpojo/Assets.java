
package com.example.demovid.vidpojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Assets {

    @SerializedName("videos")
    @Expose
    private Videos videos;
    @SerializedName("thumbnails")
    @Expose
    private List<String> thumbnails = null;
    @SerializedName("poster_frames")
    @Expose
    private List<String> posterFrames = null;

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    public List<String> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<String> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public List<String> getPosterFrames() {
        return posterFrames;
    }

    public void setPosterFrames(List<String> posterFrames) {
        this.posterFrames = posterFrames;
    }

}
