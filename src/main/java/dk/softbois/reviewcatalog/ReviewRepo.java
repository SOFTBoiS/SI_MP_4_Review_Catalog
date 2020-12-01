package dk.softbois.reviewcatalog;

import models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReviewRepo extends MongoRepository<Review, String> {

    Iterable<Review> findAllByCarId(int carId);
    Iterable<Review> findAllByUsername(String username);

}
