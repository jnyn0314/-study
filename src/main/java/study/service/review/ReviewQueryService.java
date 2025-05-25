// ReviewQueryService.java
package study.service.review;

import org.springframework.data.domain.Page;
import study.domain.Member;
import study.domain.Review;

import java.util.List;

public interface ReviewQueryService {
    List<Review> getReviewsByMemberId(Long memberId);
    Review createReview(Review request);
    Page<Review> getMyReviews(Member member, int page);
}
