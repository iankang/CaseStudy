package com.queros.casestudy.Controllers;

import com.queros.casestudy.model.MovieData;
import com.queros.casestudy.services.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Tag(name = "Task2 - Movies")
@RestController("movies")
public class Task2Controller {
    private final MovieService movieService;

    public Task2Controller(MovieService movieService) {
        this.movieService = movieService;
    }

    @Operation(description = "Get Movie By Name And Page")
    @GetMapping("/getMovie")
    public List<MovieData> getMovieTitles(
            @RequestParam("movieName") String movieName) {
        List<MovieData> movieResponseList = new LinkedList<>();
        for (int count = 1; count < 3; count++) {
            movieResponseList.addAll(movieService.getMovieByTitleAndPage(movieName, count).data);
        }
        movieResponseList.sort(Comparator.comparing(MovieData::getTitle));
        return movieResponseList;
    }
}
