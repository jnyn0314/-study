package study.service.memberMission;

import study.domain.mapping.MemberMission;
import study.web.dto.mission.MissionChallengeRequest;
import study.web.dto.mission.MissionChallengeResponse;

import java.util.List;

public interface MemberMissionService {
    List<MemberMission> getMemberMissions(Long memberId, String status, String cursor);

    List<MemberMission> getMemberMissions();

    MissionChallengeResponse challengeMission(MissionChallengeRequest request);
}
