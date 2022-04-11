package com.queros.casestudy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class MovieData {
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Year")
    public int year;
    public String imdbID;

    public MovieData(String title, int year, String imdbID) {
        this.title = title;
        this.year = year;
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieData)) return false;
        MovieData movieData = (MovieData) o;
        return getYear() == movieData.getYear() && Objects.equals(getTitle(), movieData.getTitle()) && Objects.equals(getImdbID(), movieData.getImdbID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYear(), getImdbID());
    }

    @Override
    public String toString() {
        return "MovieData{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdbID='" + imdbID + '\'' +
                '}';
    }
}
