package study.repository.missionRepository;

import study.domain.Mission;

import java.util.List;

public interface MissionRepositoryCustom {
    List<Mission> findAvailableMissionsByRegion(String regionName, String cursor, int limit);
}
