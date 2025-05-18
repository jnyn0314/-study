package study.repository.reviewRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.domain.Review;
import study.domain.QReview;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryCustomImpl implements ReviewRepositoryCustom {

    private final JPAQueryFactory queryFactory;
    private final QReview review = QReview.review;

    @Override
    public List<Review> findReviewsByMemberId(Long memberId) {
        return queryFactory.selectFrom(review)
                .where(review.member.id.eq(memberId))
                .fetch();
    }
}
