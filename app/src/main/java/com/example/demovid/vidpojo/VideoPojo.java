
package com.example.demovid.vidpojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoPojo {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
