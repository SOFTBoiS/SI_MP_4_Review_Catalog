package models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Review {
    String id;
    @NonNull String username;
    @NonNull int carId;
    @NonNull int rating;
}
