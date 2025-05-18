package study.web.controller.review;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.domain.Review;
import study.repository.reviewRepository.ReviewRepository;
import study.service.review.ReviewService;
import study.web.dto.review.ReviewCreateRequest;
import study.web.dto.review.ReviewResponseDto;

import java.util.List;


@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<ReviewResponseDto> create(@RequestBody @Valid ReviewCreateRequest request) {
        ReviewResponseDto response = reviewService.createReview(request);
        return ResponseEntity.ok(response);
    }
}