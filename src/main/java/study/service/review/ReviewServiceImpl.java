package study.service.review;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Member;
import study.domain.Review;
import study.domain.Store;
import study.repository.member.MemberRepository;
import study.repository.reviewRepository.ReviewRepository;
import study.repository.storeRepository.StoreRepository;
import study.service.review.ReviewService;
import study.web.dto.review.ReviewCreateRequest;
import study.web.dto.review.ReviewResponseDto;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final StoreRepository storeRepository;
    private final MemberRepository memberRepository;

    @Override
    public ReviewResponseDto createReview(ReviewCreateRequest request) {
        Store store = storeRepository.findById(request.getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("가게를 찾을 수 없습니다."));

        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new IllegalArgumentException("회원을 찾을 수 없습니다."));

        Review review = Review.builder()
                .store(store)
                .member(member)
                .body(request.getBody())
                .score(request.getScore())
                .build();

        Review saved = reviewRepository.save(review);

        return ReviewResponseDto.builder()
                .id(saved.getId())
                .body(saved.getBody())
                .score(saved.getScore())
                .storeName(store.getName())
                .memberName(member.getName())
                .build();
    }
}
