package patt.vishal.API_App;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    private ObjectId id;

    private String u_id;
    private String username;
    private String password;
    private Integer borrowings;

    public Users(String u_id, String username, String password, Integer borrowings) {
        this.u_id = u_id;
        this.username = username;
        this.password = password;
        this.borrowings = borrowings;
    }


}
