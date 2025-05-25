package study.repository.memberMissionRepository;

import study.domain.mapping.MemberMission;
import java.util.List;
import java.util.Optional;

public interface MemberMissionRepositoryCustom {
    List<MemberMission> findMissionsByMemberAndStatus(Long memberId, String status, String cursor, int limit);
    boolean existsByMemberIdAndMissionIdAndStatus(Long memberId, Long missionId, String status);

    Optional<Object> findMissionsByMemberAndStatus(Long memberMissionId);
}