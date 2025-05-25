package study.converter.review;

import org.springframework.data.domain.Page;
import study.domain.Review;
import study.web.dto.review.MyReviewResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ReviewConverter {

    // 단건 변환: Review → ReviewInfoDTO
    public static MyReviewResponseDTO.ReviewInfoDTO toReviewInfoDTO(Review review) {
        return MyReviewResponseDTO.ReviewInfoDTO.builder()
                .reviewId(review.getId())
                .storeName(review.getStore().getName())
                .score(review.getScore())
                .body(review.getBody())
                .createdAt(review.getCreatedAt().toLocalDate()) // LocalDateTime → LocalDate
                .build();
    }

    // Page<Review> → MyReviewResponseDTO 변환
    public static MyReviewResponseDTO toMyReviewResponseDTO(Page<Review> reviewPage) {
        List<MyReviewResponseDTO.ReviewInfoDTO> reviewList = reviewPage.getContent().stream()
                .map(ReviewConverter::toReviewInfoDTO)
                .collect(Collectors.toList());

        return MyReviewResponseDTO.builder()
                .reviewList(reviewList)
                .listSize(reviewList.size())
                .totalPage(reviewPage.getTotalPages())
                .totalElements(reviewPage.getTotalElements())
                .isFirst(reviewPage.isFirst())
                .isLast(reviewPage.isLast())
                .build();
    }
}