package patt.vishal.API_App;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController_Get {

    @Autowired
    private BookService bookService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<List<Books>> allBooks(){
    return new ResponseEntity<List<Books>>(bookService.allBooks(), HttpStatus.OK);
    }

    @GetMapping("/{isbn_id}")
    public ResponseEntity<Optional<Books>> bookById(@PathVariable String isbn_id){
        return new ResponseEntity<Optional<Books>>(bookService.bookById(isbn_id), HttpStatus.OK);
    }


}
