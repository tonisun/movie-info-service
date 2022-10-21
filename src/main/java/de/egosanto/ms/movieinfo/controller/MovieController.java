package de.egosanto.ms.movieinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * CRUD Services for Movie Domain
 *
 * @author Toni Zeidler
 * s
 */
@RestController
public class MovieController {

    @RequestMapping("/")
    public @ResponseBody String getAllMovies() {
        return "1 Movie";
    }
}
