package patt.vishal.API_App;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class BookController_admin {
    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<Books>> allBooksAdmin() {
        return new ResponseEntity<List<Books>>(bookService.allBooks(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ObjectId> addBook(@RequestBody Books book){
        return new ResponseEntity<ObjectId>(bookService.postBook(book), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<List<Books>> deleteBook(@RequestBody Books book){
        return new ResponseEntity<>(bookService.deleteBook(book.getIsbn()),HttpStatus.OK);
    }
}
