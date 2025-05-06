package study.service.memberMission;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.mapping.MemberMission;
import study.repository.memberMissionRepository.MemberMissionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberMissionServiceImpl implements MemberMissionService {

    private final MemberMissionRepository memberMissionRepository;

    @Override
    public List<MemberMission> getMemberMissions(Long memberId, String status, String cursor) {
        int limit = 15;
        return memberMissionRepository.findMissionsByMemberAndStatus(memberId, status, cursor, limit);
    }

    @Override
    public List<MemberMission> getMemberMissions() {
        return List.of();
    }
}
