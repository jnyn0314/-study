package study.web.controller.review;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import study.domain.Review;
import study.repository.reviewRepository.ReviewRepository;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewRepository reviewRepository;

    @GetMapping
    public List<Review> findAll() {
        return reviewRepository.findAll();  // Entity 직접 리턴
    }

    @PostMapping
    public Review create(@RequestBody Review review) {
        return reviewRepository.save(review);  // Entity 직접 저장
    }
}