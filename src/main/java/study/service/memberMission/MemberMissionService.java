package study.service.memberMission;

import study.domain.mapping.MemberMission;

import java.util.List;

public interface MemberMissionService {
    List<MemberMission> getMemberMissions(Long memberId, String status, String cursor);
}
