package study.service.mission;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.web.dto.mission.MissionCreateRequest;
import study.web.dto.mission.MissionResponseDto;

// interface
public interface MissionService {
    MissionResponseDto createMission(MissionCreateRequest request);
    Page<MissionResponseDto> getMissionsByStoreId(Long storeId, Pageable pageable);
}