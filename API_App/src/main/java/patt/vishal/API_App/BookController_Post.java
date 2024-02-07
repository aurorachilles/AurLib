package patt.vishal.API_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class BookController_Post {

    @Autowired
    private BookService bookService;

    //@PostMapping
    //private <Book> addBook(){

    //}
}
