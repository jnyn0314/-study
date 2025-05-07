package study.repository.mypage;
import study.domain.Mission;
import study.domain.Review;

import java.util.List;

public interface MyPageQueryRepository {
    List<Review> findMyReviews(Long memberId);
    List<Mission> findMyMissions(Long memberId, String status); // status: "CHALLENGING" 등
}