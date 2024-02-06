package patt.vishal.API_App;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    private ObjectId id;

    private String isbn;
    private String title;
    private String subtitle;
    private String author;
    private String pages;
    private String description;

}
