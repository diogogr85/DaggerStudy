package com.diogogr85.daggerstudy.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by diogoribeiro on 04/01/18.
 */

public class Film {

    private String title;
    @SerializedName("episode_id")
    private String episodeId;
    @SerializedName("release_date")
    private String releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Filme: " + this.title +
                "; Episódio: " + this.episodeId +
                "; Estréia: " + this.releaseDate;
    }
}
