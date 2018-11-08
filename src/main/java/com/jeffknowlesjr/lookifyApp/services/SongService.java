package com.jeffknowlesjr.lookifyApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeffknowlesjr.lookifyApp.models.Song;
import com.jeffknowlesjr.lookifyApp.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;
	// final meaning constant
	
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	// returns all the songs
    public List<Song> allSongs() {
        return songRepository.findAll();
    }
    // creates a song
    public Song createSong(Song s) {
        return songRepository.save(s);
    }
    // returns a list of songs
    public ArrayList<Song> findAll() {
    	return (ArrayList<Song>) songRepository.findAll();
    }
    // retrieves a song
    public Song findSong(Long id) {
    	// if you want to get what's in an optional object then just dot get it
        Optional<Song> optionalSong = songRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }
    // updates a song
	public Song updateSong(Song s) {
		return songRepository.save(s);
	// Same as save, could run a save and it would work the same!
	}
	// deletes a song
	public void destroySong(Long id) {
        songRepository.deleteById(id);
	}
	public Song getSongById(Long id) {
		songRepository.getSongById(id);
		return null;
	}

//	public ArrayList<Song> findByRating(int rat) {
//		
//	}

}

// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
