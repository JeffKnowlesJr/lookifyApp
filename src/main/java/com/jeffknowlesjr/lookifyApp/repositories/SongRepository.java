package com.jeffknowlesjr.lookifyApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffknowlesjr.lookifyApp.models.Song;
// What is the Model and the type of primary key that exists in our user model
@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findByArtistContaining(String search);
	Song getSongById(Long id);
	// Spring JPA Documentation
}

// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation