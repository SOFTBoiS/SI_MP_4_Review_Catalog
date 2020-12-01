package dk.softbois.reviewcatalog;
import models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RepositoryRestResource
@ResponseBody
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepo repo;
    private Object Review;

    @GetMapping("/")
    public List<Review> retrieveAllReviews()
    {
        System.out.println("hello1");

        return repo.findAll();
    }

    @GetMapping("/username/{username}")
    public List<Review> findAllByUsername(@PathVariable String username)
    {
        return (List<Review>) repo.findAllByUsername(username);
    }

    @GetMapping("/car-id/{carId}")
    public List<Review> findAllByCarId(@PathVariable int carId)
    {
        System.out.println("hello");
        return (List<Review>) repo.findAllByCarId(carId);
    }

    @PostMapping("/")
    public String saveReview(@RequestBody Review review)
    {
        repo.save(review);
        return " record saved..";
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable String id)
    {
        repo.deleteById(id);
        return " record deleted...";
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Object> updateCar(@RequestBody Review review, @PathVariable String id)
//    {
//        Optional<Review> found = repo.findById(id);
//
//        if (!found.isPresent())
//            return ResponseEntity.badRequest()
//                    .header("Custom-Header", "foo")
//                    .body("Try again")
//                    .notFound().build();
//        review.setId(id);
//        repo.save(review);
//        return   ResponseEntity.ok()
//                .header("Custom-Header", "foo")
//                .body("Notice the custom header")
//                .noContent().build();
//    }
}
