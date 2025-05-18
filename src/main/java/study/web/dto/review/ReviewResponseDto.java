package study.web.dto.review;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReviewResponseDto {
    private Long id;
    private String body;
    private Float score;
    private String storeName;
    private String memberName;
}
