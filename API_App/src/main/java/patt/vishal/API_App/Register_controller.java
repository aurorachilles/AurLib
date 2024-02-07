package patt.vishal.API_App;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class Register_controller {

    @Autowired
    private UserService userService;

    @PostMapping
    private ResponseEntity<Users> addUser(@RequestBody Users body){
        long unique= (long) ((new Date().getTime() * (int)(Math.random()*100)/ 1000L) % Integer.MAX_VALUE);

        return new ResponseEntity<>(userService.register_User(Long.toString(unique),body.getUsername(),body.getPassword(), body.getBorrowings()), HttpStatus.OK);

    }
}
