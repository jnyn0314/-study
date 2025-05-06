package study.repository.memberMissionRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.mapping.MemberMission;
import study.service.memberMission.MemberMissionService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberMissionRepositoryImpl implements MemberMissionService {

    private final MemberMissionRepository memberMissionRepository;

    public MemberMissionRepositoryImpl(MemberMissionRepository memberMissionRepository, MemberMissionRepository memberMissionRepository1) {
        super();
        this.memberMissionRepository = memberMissionRepository1;
    }

    @Override
    public List<MemberMission> getMemberMissions(Long memberId, String status, String cursor) {
        int limit = 15;
        return memberMissionRepository.findMissionsByMemberAndStatus(memberId, status, cursor, limit);
    }
}
