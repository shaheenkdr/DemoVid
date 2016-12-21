
package com.example.demovid.vidpojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("embed_code")
    @Expose
    private String embedCode;
    @SerializedName("source_video_file_size")
    @Expose
    private Integer sourceVideoFileSize;
    @SerializedName("sd_video_file_size")
    @Expose
    private Integer sdVideoFileSize;
    @SerializedName("hd_video_file_size")
    @Expose
    private Integer hdVideoFileSize;
    @SerializedName("security_token")
    @Expose
    private String securityToken;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("privacy")
    @Expose
    private Integer privacy;
    @SerializedName("password")
    @Expose
    private Object password;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("plays")
    @Expose
    private Integer plays;
    @SerializedName("progress")
    @Expose
    private Double progress;
    @SerializedName("requires_signed_embeds")
    @Expose
    private Boolean requiresSignedEmbeds;
    @SerializedName("selected_poster_frame_number")
    @Expose
    private Integer selectedPosterFrameNumber;
    @SerializedName("embedded_url")
    @Expose
    private Object embeddedUrl;
    @SerializedName("assets")
    @Expose
    private Assets assets;
    @SerializedName("download_sd")
    @Expose
    private Object downloadSd;
    @SerializedName("download_hd")
    @Expose
    private Object downloadHd;
    @SerializedName("download_source")
    @Expose
    private Object downloadSource;
    @SerializedName("allowed_domains")
    @Expose
    private Object allowedDomains;
    @SerializedName("allowed_ips")
    @Expose
    private Object allowedIps;
    @SerializedName("player_social_sharing")
    @Expose
    private Object playerSocialSharing;
    @SerializedName("player_embed_sharing")
    @Expose
    private Object playerEmbedSharing;
    @SerializedName("require_email")
    @Expose
    private Boolean requireEmail;
    @SerializedName("hide_on_site")
    @Expose
    private Boolean hideOnSite;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getEmbedCode() {
        return embedCode;
    }

    public void setEmbedCode(String embedCode) {
        this.embedCode = embedCode;
    }

    public Integer getSourceVideoFileSize() {
        return sourceVideoFileSize;
    }

    public void setSourceVideoFileSize(Integer sourceVideoFileSize) {
        this.sourceVideoFileSize = sourceVideoFileSize;
    }

    public Integer getSdVideoFileSize() {
        return sdVideoFileSize;
    }

    public void setSdVideoFileSize(Integer sdVideoFileSize) {
        this.sdVideoFileSize = sdVideoFileSize;
    }

    public Integer getHdVideoFileSize() {
        return hdVideoFileSize;
    }

    public void setHdVideoFileSize(Integer hdVideoFileSize) {
        this.hdVideoFileSize = hdVideoFileSize;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Integer getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Integer privacy) {
        this.privacy = privacy;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getPlays() {
        return plays;
    }

    public void setPlays(Integer plays) {
        this.plays = plays;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public Boolean getRequiresSignedEmbeds() {
        return requiresSignedEmbeds;
    }

    public void setRequiresSignedEmbeds(Boolean requiresSignedEmbeds) {
        this.requiresSignedEmbeds = requiresSignedEmbeds;
    }

    public Integer getSelectedPosterFrameNumber() {
        return selectedPosterFrameNumber;
    }

    public void setSelectedPosterFrameNumber(Integer selectedPosterFrameNumber) {
        this.selectedPosterFrameNumber = selectedPosterFrameNumber;
    }

    public Object getEmbeddedUrl() {
        return embeddedUrl;
    }

    public void setEmbeddedUrl(Object embeddedUrl) {
        this.embeddedUrl = embeddedUrl;
    }

    public Assets getAssets() {
        return assets;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    public Object getDownloadSd() {
        return downloadSd;
    }

    public void setDownloadSd(Object downloadSd) {
        this.downloadSd = downloadSd;
    }

    public Object getDownloadHd() {
        return downloadHd;
    }

    public void setDownloadHd(Object downloadHd) {
        this.downloadHd = downloadHd;
    }

    public Object getDownloadSource() {
        return downloadSource;
    }

    public void setDownloadSource(Object downloadSource) {
        this.downloadSource = downloadSource;
    }

    public Object getAllowedDomains() {
        return allowedDomains;
    }

    public void setAllowedDomains(Object allowedDomains) {
        this.allowedDomains = allowedDomains;
    }

    public Object getAllowedIps() {
        return allowedIps;
    }

    public void setAllowedIps(Object allowedIps) {
        this.allowedIps = allowedIps;
    }

    public Object getPlayerSocialSharing() {
        return playerSocialSharing;
    }

    public void setPlayerSocialSharing(Object playerSocialSharing) {
        this.playerSocialSharing = playerSocialSharing;
    }

    public Object getPlayerEmbedSharing() {
        return playerEmbedSharing;
    }

    public void setPlayerEmbedSharing(Object playerEmbedSharing) {
        this.playerEmbedSharing = playerEmbedSharing;
    }

    public Boolean getRequireEmail() {
        return requireEmail;
    }

    public void setRequireEmail(Boolean requireEmail) {
        this.requireEmail = requireEmail;
    }

    public Boolean getHideOnSite() {
        return hideOnSite;
    }

    public void setHideOnSite(Boolean hideOnSite) {
        this.hideOnSite = hideOnSite;
    }

}
