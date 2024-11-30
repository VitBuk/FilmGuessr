package com.vitbuk.FilmGuessr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.TMDBService;

@SpringBootApplication
public class FilmGuessrApplication {

	public static void main(String[] args) {
		TMDBService tmdbService = new TMDBService();
		String movieData = tmdbService.getMovieById(13);
		System.out.println(movieData);
		SpringApplication.run(FilmGuessrApplication.class, args);
	}

}
