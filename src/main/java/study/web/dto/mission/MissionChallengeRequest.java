package study.web.dto.mission;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import study.validator.mission.NotDuplicatedMission;

@Getter
@Setter
@NotDuplicatedMission
public class MissionChallengeRequest {

    @NotNull(message = "회원 ID는 필수입니다.")
    private Long memberId;

    @NotNull(message = "미션 ID는 필수입니다.")
    private Long missionId;
}