package study.service.mission;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Mission;
import study.repository.missionRepository.MissionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissionQueryServiceImpl implements MissionQueryService {

    private final MissionRepository missionRepository;

    @Override
    public List<Mission> getAvailableMissions(String regionName, String cursor) {
        int limit = 15;
        return missionRepository.findAvailableMissionsByRegion(regionName, cursor, limit);
    }
}
