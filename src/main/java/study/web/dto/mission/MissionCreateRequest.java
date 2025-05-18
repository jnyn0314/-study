package study.web.dto.mission;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissionCreateRequest {

    @NotNull(message = "가게 ID는 필수입니다.")
    private Long storeId;

    @NotBlank(message = "미션 내용은 필수입니다.")
    private String content;

    private String reward;

    private String missionSpec;

    @Future(message = "마감일은 미래 날짜여야 합니다.")
    private java.time.LocalDateTime deadline;
}