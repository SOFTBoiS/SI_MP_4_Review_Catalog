package models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Review {
    String id;
    @Getter
    @NonNull String username;
    @NonNull int carId;
    @NonNull int rating;
}
