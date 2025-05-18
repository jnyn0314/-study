package study.service.mission;

import study.web.dto.mission.MissionCreateRequest;
import study.web.dto.mission.MissionResponseDto;

// interface
public interface MissionService {
    MissionResponseDto createMission(MissionCreateRequest request);
}