package com.itschool.spring_boot_app.controllers;

import com.itschool.spring_boot_app.models.Movie;
import com.itschool.spring_boot_app.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public String getAllMovies(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index";
    }

    @PostMapping("/movie/add")
    public void addMovie(@ModelAttribute Movie movie) {
        movieService.addMovie(movie);
    }


}
