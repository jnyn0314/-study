package study.converter.review;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import study.domain.Review;
import study.web.dto.store.StoreResponseDto;

import java.util.List;

@Component
public class ReviewPreViewConverter {

    public StoreResponseDto.ReviewPreViewDTO toDTO(Review review) {
        return StoreResponseDto.ReviewPreViewDTO.builder()
                // .ownerNickname(review.getMember().getNickname())
                .score(review.getScore())
                .body(review.getBody())
                .createdAt(review.getCreatedAt().toLocalDate())
                .build();
    }

    public StoreResponseDto.ReviewPreViewListDTO toListDTO(Page<Review> reviewPage) {
        List<StoreResponseDto.ReviewPreViewDTO> reviewDTOs = reviewPage.getContent().stream()
                .map(this::toDTO)
                .toList();

        return StoreResponseDto.ReviewPreViewListDTO.builder()
                .reviewList(reviewDTOs)
                .listSize(reviewPage.getSize())
                .totalPage(reviewPage.getTotalPages())
                .totalElements(reviewPage.getTotalElements())
                .isFirst(reviewPage.isFirst())
                .isLast(reviewPage.isLast())
                .build();
    }
}