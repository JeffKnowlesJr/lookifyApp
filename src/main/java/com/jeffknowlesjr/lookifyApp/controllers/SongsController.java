package com.jeffknowlesjr.lookifyApp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffknowlesjr.lookifyApp.models.Song;
import com.jeffknowlesjr.lookifyApp.services.SongService;

@Controller
public class SongsController {
    private final SongService songService;
    
    public SongsController(SongService songService) {
        this.songService = songService;
    }
    
    @RequestMapping("/songs")
    public String index(Model model) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
        return "/songs/index.jsp";
    }
    
    @RequestMapping(value="/songs/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        Song song = songService.getSongById(id);
        model.addAttribute("song", song);
        return "/songs/prealpha.jsp";
    }
}
