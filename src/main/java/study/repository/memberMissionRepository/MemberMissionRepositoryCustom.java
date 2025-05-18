package study.repository.memberMissionRepository;

import study.domain.mapping.MemberMission;
import java.util.List;

public interface MemberMissionRepositoryCustom {
    List<MemberMission> findMissionsByMemberAndStatus(Long memberId, String status, String cursor, int limit);
}