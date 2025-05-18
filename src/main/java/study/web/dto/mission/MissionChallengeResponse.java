package study.web.dto.mission;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class MissionChallengeResponse {
    private Long id;
    private Long memberId;
    private Long missionId;
    private String status;
    private LocalDateTime createdAt;
}