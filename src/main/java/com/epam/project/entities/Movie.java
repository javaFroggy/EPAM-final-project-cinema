package com.epam.project.entities;

import java.util.Objects;

public class Movie {
    private Integer id;
    private String name;
    private Integer duration;
    private String genre;
    private String actors;
    private String authors;
    private String studio;
    private String country;
    private String notes;

    public Movie(){

    }

    /** Getter methods */
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getActors() {
        return actors;
    }

    public String getAuthors() {
        return authors;
    }

    public String getStudio() {
        return studio;
    }

    public String getCountry() {
        return country;
    }

    public String getNotes() {
        return notes;
    }

    /** Setter methods */
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && Objects.equals(authors, movie.authors);
    }

    @Override
    public int hashCode() {
        return 31 * id.hashCode() + 13;
    }

    @Override
    public String toString() {
        return  "\nMovie ID=" + id +
                "\nName='" + name +
                "\nDuration=" + duration +
                "\nGenre='" + genre +
                "\nActors='" + actors +
                "\nAuthors='" + authors +
                "\nStudio='" + studio +
                "\nCountry='" + country +
                "\nNotes='" + notes +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
