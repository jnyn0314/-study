package study.service.review;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import study.domain.Member;
import study.domain.Review;
import study.domain.Store;
import study.repository.memberMissionRepository.MemberMissionRepositoryCustom;
import study.repository.reviewRepository.ReviewRepository;
import study.repository.storeRepository.StoreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewQueryServiceImpl implements ReviewQueryService {

    private final ReviewRepository reviewRepository;
    private final StoreRepository storeRepository;
    private final MemberMissionRepositoryCustom memberMissionRepository;

    @Override
    public List<Review> getReviewsByMemberId(Long memberId) {
        return reviewRepository.findReviewsByMemberId(memberId);
    }

    @Override
    public Review createReview(Review request) {
        // memberId, storeId는 request 내부에 객체로 안 들어오므로 별도 필드로 전달돼야 함.
        Long memberMissionId = request.getMember().getId();
        Long storeId = request.getStore().getId();

        Member member = (Member) memberMissionRepository.findMissionsByMemberAndStatus(memberMissionId)
                .orElseThrow(() -> new IllegalArgumentException("회원 없음"));

        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new IllegalArgumentException("가게 없음"));

        Review review = Review.builder()
                .member(member)
                .store(store)
                .body(request.getBody())
                .score(request.getScore())
                .build();

        return reviewRepository.save(review);
    }

    @Override
    public Page<Review> getMyReviews(Member member, int page) {
        Pageable pageable = PageRequest.of(page, 10, Sort.by("createdAt").descending());
        return reviewRepository.findAllByMember(member, pageable);
    }
}
