package com.queros.casestudy.services;

import com.queros.casestudy.model.MovieResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Making movie requests using the Movie Service
 */
@Service
public class MovieService {

    private final RestTemplate restTemplate;
//    private final String movieUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman&page=1";
    private final String movieUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title={Title}&page={page}";

    public MovieService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    /**
     * Get MoviesByPage
     * @param page
     * @return
     */
    public MovieResponse getMovieByTitleAndPage(String movie, int page) {

        ResponseEntity<MovieResponse> response = restTemplate.getForEntity(movieUrl, MovieResponse.class, movie, page);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        }
        return null;
    }
}
