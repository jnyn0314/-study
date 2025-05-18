package study.service.mission;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Mission;
import study.domain.Store;
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
                .storeName(store.getName())
                .build();
    }
}