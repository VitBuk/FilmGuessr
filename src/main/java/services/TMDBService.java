package services;

import constants.TMDBConstants;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class TMDBService {

    public String getMovieById(int movieId) {
        String url = TMDBConstants.BaseUrl + movieId + "?api_key=" + TMDBConstants.APIKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
