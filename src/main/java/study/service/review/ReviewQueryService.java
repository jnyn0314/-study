// ReviewQueryService.java
package study.service.review;

import study.domain.Review;
import java.util.List;

public interface ReviewQueryService {
    List<Review> getReviewsByMemberId(Long memberId);
}
