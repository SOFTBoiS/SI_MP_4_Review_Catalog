package models;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class User {
    String id;
    @NonNull
    @Indexed(unique = true)
    String username;
    @Getter
    List<Integer> cars;
}
