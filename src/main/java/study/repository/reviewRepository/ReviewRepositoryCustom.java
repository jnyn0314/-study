package study.repository.reviewRepository;

import study.domain.Review;
import java.util.List;

public interface ReviewRepositoryCustom {
    List<Review> findReviewsByMemberId(Long memberId);
}

