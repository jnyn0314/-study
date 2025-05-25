package study.web.dto.review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyReviewResponseDTO {

    private List<ReviewInfoDTO> reviewList;
    private int listSize;
    private int totalPage;
    private long totalElements;
    private boolean isFirst;
    private boolean isLast;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ReviewInfoDTO {
        private Long reviewId;
        private String storeName;
        private Float score;
        private String body;
        private LocalDate createdAt;
    }
}