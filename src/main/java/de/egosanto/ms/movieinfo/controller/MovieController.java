package de.egosanto.ms.movieinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MovieController {

    @RequestMapping("/")
    public void getAllMovies() {
        System.out.println("Movie 1");

    }
}
