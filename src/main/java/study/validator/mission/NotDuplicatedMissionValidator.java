package study.validator.mission;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.web.dto.mission.MissionChallengeRequest;
import study.repository.memberMissionRepository.MemberMissionRepositoryCustom;

@Component
@RequiredArgsConstructor
public class NotDuplicatedMissionValidator implements ConstraintValidator<NotDuplicatedMission, MissionChallengeRequest> {

    private final MemberMissionRepositoryCustom memberMissionRepository;

    @Override
    public boolean isValid(MissionChallengeRequest request, ConstraintValidatorContext context) {
        if (request == null) return true;

        // 이미 도전 중인지 검사 (IN_PROGRESS 상태)
        boolean exists = memberMissionRepository.existsByMemberIdAndMissionIdAndStatus(
                request.getMemberId(), request.getMissionId(), "IN_PROGRESS"
        );

        return !exists; // 존재하면 유효하지 않음
    }
}