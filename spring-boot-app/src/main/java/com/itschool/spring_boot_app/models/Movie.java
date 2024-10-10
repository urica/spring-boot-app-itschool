package com.itschool.spring_boot_app.models;

import lombok.Data;

@Data
public class Movie {
    private String title;
    private String director;
    private String gen;
    private int releaseYear;
    private String description;

}
