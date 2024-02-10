package patt.vishal.API_App;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
@Autowired
    private BookRepo bookRepo;
    public List<Books> allBooks(){
        return bookRepo.findAll();
    }

    public Optional<Books> bookById(String isbn_id){
        return bookRepo.getBookByIsbn(isbn_id);
    }

    public ObjectId postBook(Books books){
        return bookRepo.insert(books).getId();
    }

    public List<Books> deleteBook(String isbn){
        return bookRepo.deleteByIsbn(isbn);
    }
}
