package study.service.mission;

import study.domain.Mission;

import java.util.List;

public interface MissionQueryService {
    List<Mission> getAvailableMissions(String regionName, String cursor);
}
