package study.web.controller.mypage;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.domain.Mission;
import study.domain.Review;
import study.repository.missionRepository.MissionRepository;
import study.repository.reviewRepository.ReviewRepository;

import java.util.List;

@RestController
@RequestMapping("/api/mypage")
@RequiredArgsConstructor
public class MyPageController {

    private final MissionRepository missionRepository;
    private final ReviewRepository reviewRepository;

    @GetMapping("/missions")
    public ResponseEntity<List<Mission>> getMyMissions(@RequestParam Long memberId) {
        List<Mission> missions = missionRepository.findAllByMemberId(memberId);
        return ResponseEntity.ok(missions);
    }

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getMyReviews(@RequestParam Long memberId) {
        List<Review> reviews = reviewRepository.findByMember_Id(memberId);
        return ResponseEntity.ok(reviews);
    }
}
