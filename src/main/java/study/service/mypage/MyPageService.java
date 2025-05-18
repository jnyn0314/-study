package study.service.mypage;


import study.domain.Mission;
import study.domain.Review;

import java.util.List;

public interface MyPageService {
    List<Review> getMyReviews(Long memberId);
    List<Mission> getMyMissions(Long memberId, String status);
}