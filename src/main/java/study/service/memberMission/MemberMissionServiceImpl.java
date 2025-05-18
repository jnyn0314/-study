package study.service.memberMission;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Member;
import study.domain.Mission;
import study.domain.enums.MissionStatus;
import study.domain.mapping.MemberMission;
import study.repository.member.MemberRepository;
import study.repository.memberMissionRepository.MemberMissionRepository;
import study.repository.missionRepository.MissionRepository;
import study.web.dto.mission.MissionChallengeRequest;
import study.web.dto.mission.MissionChallengeResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberMissionServiceImpl implements MemberMissionService {

    private final MemberMissionRepository memberMissionRepository;
    private final MemberRepository memberRepository;
    private final MissionRepository missionRepository;
    @Override
    public List<MemberMission> getMemberMissions(Long memberId, String status, String cursor) {
        int limit = 15;
        return memberMissionRepository.findMissionsByMemberAndStatus(memberId, status, cursor, limit);
    }

    @Override
    public List<MemberMission> getMemberMissions() {
        return List.of();
    }

    @Override
    public MissionChallengeResponse challengeMission(MissionChallengeRequest request) {
        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));
        Mission mission = missionRepository.findById(request.getMissionId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 미션입니다."));

        MemberMission memberMission = MemberMission.builder()
                .member(member)
                .mission(mission)
                .status(MissionStatus.valueOf("IN_PROGRESS")) // 기본값
                .build();

        MemberMission saved = memberMissionRepository.save(memberMission);

        return MissionChallengeResponse.builder()
                .id(saved.getId())
                .memberId(member.getId())
                .missionId(mission.getId())
                .status(String.valueOf(saved.getStatus()))
                .createdAt(saved.getCreatedAt())
                .build();
    }
}
