package patt.vishal.API_App;


import org.bson.types.ObjectId;
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
@RequestMapping("/get")
public class BookController_Get {

    @Autowired
    private BookService bookService;

    @GetMapping
public ResponseEntity<List<Books>> allBooks(){
    return new ResponseEntity<List<Books>>(bookService.allBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Books>> bookById(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Books>>(bookService.bookById(id), HttpStatus.OK);
    }


}
