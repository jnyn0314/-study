package study.service.mypage;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Mission;
import study.domain.Review;
import study.repository.mypage.MyPageQueryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyPageServiceImpl implements MyPageService {

    private final MyPageQueryRepository myPageQueryRepository;

    @Override
    public List<Review> getMyReviews(Long memberId) {
        return myPageQueryRepository.findMyReviews(memberId);
    }

    @Override
    public List<Mission> getMyMissions(Long memberId, String status) {
        return myPageQueryRepository.findMyMissions(memberId, status);
    }
}
