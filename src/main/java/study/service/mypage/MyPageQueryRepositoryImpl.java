package study.service.mypage;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.domain.Mission;
import study.domain.QMission;
import study.domain.QReview;
import study.domain.Review;
import study.repository.mypage.MyPageQueryRepository;

import java.util.List;

import static study.domain.QReview.review;
import static study.domain.QStore.store;
import static study.domain.QMission.mission;
import static study.domain.mapping.QMemberMission.memberMission;

@Repository
@RequiredArgsConstructor
public class MyPageQueryRepositoryImpl implements MyPageQueryRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Review> findMyReviews(Long memberId) {
        return queryFactory
                .select(review)
                .from(review)
                .join(review.store, store)
                .where(review.member.id.eq(memberId))
                .fetch();
    }

    @Override
    public List<Mission> findMyMissions(Long memberId, String status) {
        return queryFactory
                .select(mission)
                .from(memberMission)
                .join(memberMission.mission, mission)
                .where(memberMission.member.id.eq(memberId)
                        .and(mission.status.eq(status)))
                .fetch();
    }
}
