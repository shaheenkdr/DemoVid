
package com.example.demovid.vidpojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Videos {

    @SerializedName("240p")
    @Expose
    private String _240p;
    @SerializedName("360p")
    @Expose
    private Object _360p;
    @SerializedName("480p")
    @Expose
    private Object _480p;
    @SerializedName("720p")
    @Expose
    private Object _720p;
    @SerializedName("1080p")
    @Expose
    private Object _1080p;
    @SerializedName("2k")
    @Expose
    private Object _2k;
    @SerializedName("4k")
    @Expose
    private Object _4k;
    @SerializedName("8k")
    @Expose
    private Object _8k;
    @SerializedName("source")
    @Expose
    private Object source;

    public String get240p() {
        return _240p;
    }

    public void set240p(String _240p) {
        this._240p = _240p;
    }

    public Object get360p() {
        return _360p;
    }

    public void set360p(Object _360p) {
        this._360p = _360p;
    }

    public Object get480p() {
        return _480p;
    }

    public void set480p(Object _480p) {
        this._480p = _480p;
    }

    public Object get720p() {
        return _720p;
    }

    public void set720p(Object _720p) {
        this._720p = _720p;
    }

    public Object get1080p() {
        return _1080p;
    }

    public void set1080p(Object _1080p) {
        this._1080p = _1080p;
    }

    public Object get2k() {
        return _2k;
    }

    public void set2k(Object _2k) {
        this._2k = _2k;
    }

    public Object get4k() {
        return _4k;
    }

    public void set4k(Object _4k) {
        this._4k = _4k;
    }

    public Object get8k() {
        return _8k;
    }

    public void set8k(Object _8k) {
        this._8k = _8k;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

}
