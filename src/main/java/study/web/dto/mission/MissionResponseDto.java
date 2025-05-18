package study.web.dto.mission;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class MissionResponseDto {
    private Long id;
    private String content;
    private String reward;
    private String missionSpec;
    private LocalDateTime deadline;
    private String storeName;
}