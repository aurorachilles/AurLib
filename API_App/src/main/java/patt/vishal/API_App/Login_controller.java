package patt.vishal.API_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class Login_controller {

    @Autowired
    UserService userService;

    @PostMapping
    private ResponseEntity<Optional<String>> userLogin(@RequestBody Users user){

        return new ResponseEntity<>(userService.login_User(user.getUsername(), user.getPassword()),HttpStatus.OK);
    }


}
