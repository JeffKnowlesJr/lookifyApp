package com.jeffknowlesjr.lookifyApp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jeffknowlesjr.lookifyApp.models.Song;
import com.jeffknowlesjr.lookifyApp.services.SongService;


@Controller
public class SongsApi {
	private final SongService songService;
	
	public SongsApi(SongService songService) {
		System.out.println("SONG CONTROLLER INIT");
		this.songService = songService;
	}
	
	// New
	@RequestMapping("/api/addSong")
		public String root( Model model) {
		model.addAttribute("song", new Song());
		return "users";
	}
	
	@RequestMapping("/api/songs")
	@ResponseBody
	public List<Song> index() {
		System.out.println("HITTING ROUTE LIST SONGS");
		return songService.allSongs();
	}
	
	@RequestMapping(value="/api/songs", method=RequestMethod.POST)
	public Song create(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist,  @RequestParam(value="link") String link, @RequestParam(value="rating") Integer rating) {
		Song song = new Song(title, artist, link, rating);
		return songService.createSong(song);
	}
	
	@RequestMapping("/api/songs/{id}")
	@ResponseBody
	public Song show(@PathVariable("id") Long id) {
		Song song = songService.findSong(id);
		return song;
	}
	
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Song update(@PathVariable("id") Long id) {
        Song song = songService.getSongById(id);
        song = songService.updateSong(song);
        return song;
    }
	
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        songService.destroySong(id);
    }
    
//    @GetMapping("/{userId}")
//    public String findById( @PathVariable("userId") Long userId, Model model ) {
//    	userService.findById( userId );
//    	User user = userService.findById( userId );
//    	if(user == null) { 
//    		return "redirect:/users";
//    	}
//    	model.addAttribute("user", user);
//    	return "show.jsp";
//    }
}
