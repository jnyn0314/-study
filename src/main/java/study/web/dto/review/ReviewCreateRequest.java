package study.web.dto.review;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.validator.review.ExistStore;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewCreateRequest {

    @ExistStore
    @NotNull(message = "가게 ID는 필수입니다.")
    private Long storeId;

    @NotNull(message = "회원 ID는 필수입니다.")
    private Long memberId;

    @NotBlank(message = "리뷰 본문은 비어 있을 수 없습니다.")
    private String body;

    @NotNull(message = "평점은 필수입니다.")
    @Min(value = 1, message = "최소 평점은 1점입니다.")
    @Max(value = 5, message = "최대 평점은 5점입니다.")
    private Float score;
}