package com.example.alcm.marvel.characters.models;

import java.util.Date;
import java.util.List;

public class Character {

    private int id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private List<URL> urls;
    private Image thumbnail;
    private ComicList comics;
    private StoryList stories;
    private EventList events;
    private SeriesList series;
}
