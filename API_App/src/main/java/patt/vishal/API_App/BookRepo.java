package patt.vishal.API_App;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends MongoRepository<Books, ObjectId> {
    Optional<Books> getBookByIsbn(String isbn);

    List<Books> deleteByIsbn(String isbn);
}
