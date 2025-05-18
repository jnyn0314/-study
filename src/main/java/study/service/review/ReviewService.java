package study.service.review;


import study.web.dto.review.ReviewCreateRequest;
import study.web.dto.review.ReviewResponseDto;

public interface ReviewService {
    ReviewResponseDto createReview(ReviewCreateRequest request);
}
