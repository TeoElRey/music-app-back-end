package dev.teodor.music;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MusicRepo extends MongoRepository<Music, ObjectId> {
    Optional<Music> findMusicById(String id);
}
