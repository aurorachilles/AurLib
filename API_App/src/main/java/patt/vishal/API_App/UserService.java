package patt.vishal.API_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Users register_User(String u_id, String username, String password, Integer borrowings){
        Users new_user = new Users(u_id,username,password,borrowings);

        userRepo.insert(new_user);
        return new_user;
    }

    public Optional<String> login_User(String username, String password){
        Optional<Users> user = userRepo.findByUsername(username);

     if(user.isPresent() && user.get().getPassword().equals(password)){
         return Optional.of(user.get().getU_id());
     }
    return Optional.empty();
    }


}
