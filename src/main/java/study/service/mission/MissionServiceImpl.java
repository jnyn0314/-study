package study.service.mission;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.converter.mission.MissionConverter;
import study.domain.Mission;
import study.domain.Store;
import study.domain.enums.MissionStatus;
import study.domain.mapping.MemberMission;
import study.repository.memberMissionRepository.MemberMissionRepository;
import study.repository.missionRepository.MissionRepository;
import study.repository.storeRepository.StoreRepository;
import study.web.dto.mission.MissionCreateRequest;
import study.web.dto.mission.MissionResponseDto;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class MissionServiceImpl implements MissionService {

    private final MissionRepository missionRepository;
    private final StoreRepository storeRepository;
    private final MemberMissionRepository memberMissionRepository;

    @Override
    public MissionResponseDto createMission(MissionCreateRequest request) {
        Store store = storeRepository.findById(request.getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 가게입니다."));

        Mission mission = Mission.builder()
                .store(store)
                .content(request.getContent())
                .reward(Integer.valueOf(request.getReward()))
                .missionSpec(request.getMissionSpec())
                .deadline(LocalDate.from(request.getDeadline()))
                .build();

        Mission saved = missionRepository.save(mission);

        return MissionResponseDto.builder()
                .id(saved.getId())
                .content(saved.getContent())
                .reward(String.valueOf(saved.getReward()))
                .missionSpec(saved.getMissionSpec())
                .deadline(saved.getDeadline().atStartOfDay())
                // .storeName(store.getName())
                .build();
    }

    @Override
    public Page<MissionResponseDto> getMissionsByStoreId(Long storeId, Pageable pageable) {
        Page<Mission> missions = missionRepository.findByStoreId(storeId, pageable);
        return missions.map(MissionConverter::toDto); // map으로 변환
    }

    // 도전중인 미션 조회하기
    @Override
    public Page<MissionResponseDto> getInProgressMissions(Long memberId, Pageable pageable) {
        return memberMissionRepository.findByMemberIdAndStatus(memberId, MissionStatus.CHALLENGING, pageable)
                .map(this::toDto);
    }

    private MissionResponseDto toDto(MemberMission memberMission) {
        Mission mission = memberMission.getMission();
        return MissionResponseDto.builder()
                .id(mission.getId())
                .content(mission.getContent())
                .reward(String.valueOf(mission.getReward()))
                .missionSpec(mission.getMissionSpec())
                .deadline(mission.getDeadline().atStartOfDay())
                .missionStatus(memberMission.getStatus().name())
                .createdAt(mission.getCreatedAt())
                .build();
    }

    @Transactional
    @Override
    public void completeMission(Long memberId, Long missionId) {
        MemberMission memberMission = memberMissionRepository
                .findByMemberIdAndMissionId(memberId, missionId)
                .orElseThrow(() -> new IllegalArgumentException("해당 미션이 존재하지 않습니다."));

        if (memberMission.getStatus() == MissionStatus.COMPLETE) {
            throw new IllegalStateException("이미 완료된 미션입니다.");
        }

        memberMission.complete(); // 엔티티 내부에서 상태 변경
    }
}