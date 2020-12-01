package dk.softbois.reviewcatalog;

import models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RepositoryRestResource
public interface ReviewRepo extends MongoRepository<Review, String> {

    Iterable<Review> findAllByCarId(int carId);
    Iterable<Review> findAllByUsername(String username);
    Review findByUsername(String username);

}
