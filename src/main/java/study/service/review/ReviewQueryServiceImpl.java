package study.service.review;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Review;
import study.repository.reviewRepository.ReviewRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewQueryServiceImpl implements ReviewQueryService {

    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> getReviewsByMemberId(Long memberId) {
        return reviewRepository.findReviewsByMemberId(memberId);
    }
}
