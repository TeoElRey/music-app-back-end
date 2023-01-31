package dev.teodor.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/music/api")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping
    public ResponseEntity<List<Music>> getMusic() {
        return new ResponseEntity<List<Music>>(musicService.findAllMusic(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Music>> getSingleMovie(@PathVariable String id){
        return new ResponseEntity<Optional<Music>>(musicService.findMusicById(id), HttpStatus.OK);
    }
}
