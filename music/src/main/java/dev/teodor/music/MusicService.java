package dev.teodor.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicService {
    @Autowired
    private MusicRepo musicRepo;

    public List<Music> findAllMusic() {
        return musicRepo.findAll();
    }

    public Optional<Music> findMusicById(String id) {
        return musicRepo.findMusicById(id);
    }

}
