package models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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
    List<Integer> cars;
}
