package patt.vishal.API_App;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends MongoRepository<Users, ObjectId> {

    Optional<Users> findByUsername(String username);
}
